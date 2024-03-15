public class CurpGenerator {
    
    private String pat;
    private String mat;
    private String nombre;
    private String nac;
    private byte genero;

    public String getPat() {
        return pat;
    }
    public void setPat(String pat) {
        this.pat = pat;
    }
    public String getMat() {
        return mat;
    }
    public void setMat(String mat) {
        this.mat = mat;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNac() {
        return nac;
    }
    public void setNac(String nac) {
        this.nac = nac;
    }
    public byte getGenero() {
        return genero;
    }
    public void setGenero(byte genero) {
        this.genero = genero;
    }

    // TODO Con esto se puede empezar a procesar la informacion
    public String testInput(){
        return getPat() + " Esto fue una prueba de funcionamiento";
    }
    
}
