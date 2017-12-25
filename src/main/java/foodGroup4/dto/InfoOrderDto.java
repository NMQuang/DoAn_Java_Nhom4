package foodGroup4.dto;

public class InfoOrderDto {
    private boolean useNewInfo = false;
    private String newSdt;
    private String newTen;
    private String newDiaChi;

    public boolean getUseNewInfo() {
        return useNewInfo;
    }

    public void setUseNewInfo(boolean useNewInfo) {
        this.useNewInfo = useNewInfo;
    }

    public String getNewSdt() {
        return newSdt;
    }

    public void setNewSdt(String newSdt) {
        this.newSdt = newSdt;
    }

    public String getNewTen() {
        return newTen;
    }

    public void setNewTen(String newTen) {
        this.newTen = newTen;
    }

    public String getNewDiaChi() {
        return newDiaChi;
    }

    public void setNewDiaChi(String newDiaChi) {
        this.newDiaChi = newDiaChi;
    }
}
