package qcuco.tienda.dto;

public class StockDto {
    private Integer stock;

    public StockDto() {
    }

    public StockDto(Integer stock) {
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
