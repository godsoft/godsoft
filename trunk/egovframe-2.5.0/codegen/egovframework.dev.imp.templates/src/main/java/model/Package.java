package model;

public class Package {

    private String voPackage;

    public String getVoPackage() {
        return voPackage;
    }

    public void setVoPackage(String voPackage) {
        this.voPackage = voPackage;
    }

    public void setVoPackage(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPackageName());
        sb.append(".");
        sb.append(dataModel.getEntity().getLcName());
        sb.append(".service");

        this.voPackage = sb.toString();
    }

}
