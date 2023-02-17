package com.solvd.AviaCompany.db.tablecolumns;

public enum CityColumn {

    ID("id"),
    NAME("name"),
    COUNTRY("countryID");

    private String column;

    CityColumn(String column) {
        this.column = column;
    }

    public String getColumn() {
        return column;
    }
}