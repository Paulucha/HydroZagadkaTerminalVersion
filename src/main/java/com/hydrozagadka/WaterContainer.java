package com.hydrozagadka;

import java.util.List;

public class WaterContainer {
    private Integer id;
    private String containerName;
    private String stationName;
    private String province;
    private List<History> history;

    Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    String getProvince() {
        return province;
    }

    void setProvince(String province) {
        this.province = province;
    }

    List<History> getHistory() {
        return history;
    }

    public void setHistory(List<History> history) {
        this.history = history;
    }


    WaterContainer(Integer id, String containerName, String stationName, String province, List<History> history) {
        this.id = id;
        this.containerName = containerName;
        this.stationName = stationName;
        this.history = history;
        this.province = province;

    }

    @Override
    public String toString() {
        return "WaterContainer{" +
                "id=" + id +
                ", containerName='" + containerName + '\'' +
                ", stationName='" + stationName + '\'' +
                ", province='" + province + '\'' +
                ", history=" + history +
                '}';
    }
}
