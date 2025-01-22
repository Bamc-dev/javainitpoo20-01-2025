package org.example.exceptions;

public class CompteBancaire {
    private String numero;
    private double solde;

    private static int nbComptes;

    public CompteBancaire(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
        nbComptes++;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public static int getNbComptes() {
        return nbComptes;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "numero='" + numero + '\'' +
                ", solde=" + solde +
                '}';
    }

    //Retirer
    public void retirer(double montant) throws MontantInvalidException, SoldeInsuffisantException {
        if(montant<0)
        {
            //System.out.println("Montant invalid, il doit être positif");
            throw new MontantInvalidException("Montant invalid. Le montant doit être positif");
        } else if (montant > solde) {
            //System.out.println("Montant invalid, solde insuffisant");
            throw new SoldeInsuffisantException("Solde insuffisant pour le retrait actuel : "+this.solde);
        }else {
            this.solde -= montant;
            System.out.println("Retrait de "+montant+" effectué. Nouveau solde : "+this.solde);
        }
    }

    public void verser(double montant) throws MontantInvalidException {
        if(montant < 0)
        {
            //System.out.println("Montant invalid. Le montant doit être positif");
            throw new MontantInvalidException("Montant invalid. Le montant doit être positif");
        }
        else {
            this.solde += montant;
            System.out.println("Versement de " + montant + " effectué. Nouveau solde : "+this.solde);
        }
    }

    public void virement(CompteBancaire compteDestinataire, double montant) throws SoldeInsuffisantException, MontantInvalidException, CompteIntrouvableException, VirementMemeCompteException {
        if (compteDestinataire == null)
        {
            //System.out.println("Virement impossible : Le compte destinataire n'existe pas");
            throw new CompteIntrouvableException("Virement impossible : Le compte destinataire n'existe pas."); //CompteIntrouvable, on à un constructeur
                                                                                                                // par défaut qui affiche un message par défaut : "Compte Introuvable"
        }
        if(montant > this.solde)
        {
            //System.out.println("Solde insuffisant pour le retrait actuel : "+this.solde);
            throw new SoldeInsuffisantException("Solde insuffisant pour le retrait actuel : "+this.solde);
        }
        if(montant<0)
        {
            //System.out.println("Montant invalid. Le montant doit être positif");
            throw new MontantInvalidException("Montant invalid. Le montant doit être positif");
        }
        if(this.equals(compteDestinataire))
        {
            //System.out.println("Virement impossible. Vous ne pouvez pas effectuer un virement sur le même compte");
            throw new VirementMemeCompteException();
        }

        this.retirer(montant);
        compteDestinataire.verser(montant);

    }
}
