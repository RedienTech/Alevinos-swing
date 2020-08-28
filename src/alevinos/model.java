package alevinos;

public final class model {
    private String identificacion;
    private float width;
    private float large;
    private float deep;
    public String type;
    
    public model(String id, float width, float large, float deep, String type){
        this.setIdentificacion(id);
        this.setLarge(large);
        this.setWidth(width);
        this.setDeep(deep);
        this.setType(type);
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public void setLarge(float large) {
        this.large = large;
    }
    public void setDeep(float deep) {
        this.deep = deep;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public float getWidth() {
        return width;
    }
    public float getLarge() {
        return large;
    }
    public float getDeep() {
        return deep;
    }
    public String getType() {
        return type;
    }
    public float calcAgua(){
        return this.width * this.large * this.deep;
    }
    private int getTasa(){
        if ("Cachamas".equals(this.getType())){
            return 4;
        } if ("Tilapias".equals(this.getType())) {
            return 5;
        } if ("Carpas".equals(this.getType())) {
            return 6;
        }
        return 0;
    }
    public int calcAlevinos(){
        return (int) Math.floor(this.calcAgua() * this.getTasa());
    }
    public float calcAlimento(){
        return (float) (this.calcAlevinos() / 1000) * 4;
    }
}