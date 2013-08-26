package model;

public class Packages {

    private String voPackage;

    private String servicePackage;

    private String daoPackage;

    private String implPackage;

    private String controllerPackage;

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

    public String getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(String servicePackage) {
        this.servicePackage = servicePackage;
    }

    public void setServicePackage(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPackageName());
        sb.append(".");
        sb.append(dataModel.getEntity().getLcName());
        sb.append(".service");

        this.servicePackage = sb.toString();
    }

    public String getDaoPackage() {
        return daoPackage;
    }

    public void setDaoPackage(String daoPackage) {
        this.daoPackage = daoPackage;
    }

    public void setDaoPackage(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPackageName());
        sb.append(".");
        sb.append(dataModel.getEntity().getLcName());
        sb.append(".service.impl");

        this.daoPackage = sb.toString();
    }

    public String getImplPackage() {
        return implPackage;
    }

    public void setImplPackage(String implPackage) {
        this.implPackage = implPackage;
    }

    public void setImplPackage(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPackageName());
        sb.append(".");
        sb.append(dataModel.getEntity().getLcName());
        sb.append(".service.impl");

        this.implPackage = sb.toString();
    }

    public String getControllerPackage() {
        return controllerPackage;
    }

    public void setControllerPackage(String controllerPackage) {
        this.controllerPackage = controllerPackage;
    }

    public void setControllerPackage(DataModelContext dataModel) {
        StringBuilder sb = new StringBuilder();

        sb.append(dataModel.getPackageName());
        sb.append(".");
        sb.append(dataModel.getEntity().getLcName());
        sb.append(".web");

        this.controllerPackage = sb.toString();
    }

}
