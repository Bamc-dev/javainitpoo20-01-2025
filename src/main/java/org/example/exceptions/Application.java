package org.example.exceptions;

public class Application {
    public static void main(String[] args) {
        CompteBancaire cb1 = new CompteBancaire("AFD875", 25000);
        CompteBancaire cb2 = new CompteBancaire("YT8522", 100);

        CompteBancaire cb3 = null;
        //cb3.getSolde(); // java.lang.NullPointerException (Exception non surveuillée)

        try {
            cb2.retirer(-250);
        } catch (MontantInvalidException | SoldeInsuffisantException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            cb1.virement(null, 5000);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            cb1.virement(cb2, 5000);
        } catch (SoldeInsuffisantException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (MontantInvalidException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (CompteIntrouvableException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (VirementMemeCompteException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
