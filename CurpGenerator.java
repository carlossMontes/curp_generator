public class CurpGenerator {
    public String pat;
    public String mat;
    public String nombre;
    public String nac;
    public String genero;
    public String edo;

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
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getEdo() {
        return edo;
    }
    public void setEdo(String edo) {
        this.edo = edo;
    }

    public String generator(){
        String paterno = getPat().substring(0, 2).toUpperCase();
        String materno = getMat().substring(0, 1).toUpperCase();
        String nombre = getNombre().substring(0, 1).toUpperCase();
        String fecha[] = getNac().split("\\/");
        String fechaFormato = fecha[0].substring(2, 4) + fecha[1] + fecha[2];

        return paterno + materno + nombre + fechaFormato;
    }
}
