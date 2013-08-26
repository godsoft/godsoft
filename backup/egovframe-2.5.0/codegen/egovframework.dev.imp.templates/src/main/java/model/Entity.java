package model;

public class Entity extends NameCasing {

    private String alias;

    public Entity(String name) {
        super(name);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

}
