package org.example.exosFilRouge;

import java.util.List;

public class Scene {
    private List<Entity> entityList;

    public Scene(List<Entity> entityList) {
        this.entityList = entityList;
    }

    public void addToScene(Entity entity)
    {
        entityList.add(entity);
    }
    public void renderAllEntity()
    {
        entityList.forEach(Entity::render);
    }
}
