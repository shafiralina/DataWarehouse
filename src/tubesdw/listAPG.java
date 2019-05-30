
package tubesdw;

class listAPG {
    String IDKARYAWAN,NAMAKARYAWAN,GENDER,NAMATIM;

    public listAPG(String IDKARYAWAN, String NAMAKARYAWAN, String GENDER, String NAMATIM) {
        this.IDKARYAWAN = IDKARYAWAN;
        this.NAMAKARYAWAN = NAMAKARYAWAN;
        this.GENDER = GENDER;
        this.NAMATIM = NAMATIM;
    }

    public String getIDKARYAWAN() {
        return IDKARYAWAN;
    }

    public void setIDKARYAWAN(String IDKARYAWAN) {
        this.IDKARYAWAN = IDKARYAWAN;
    }

    public String getNAMAKARYAWAN() {
        return NAMAKARYAWAN;
    }

    public void setNAMAKARYAWAN(String NAMAKARYAWAN) {
        this.NAMAKARYAWAN = NAMAKARYAWAN;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getNAMATIM() {
        return NAMATIM;
    }

    public void setNAMATIM(String NAMATIM) {
        this.NAMATIM = NAMATIM;
    }
}
