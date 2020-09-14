package com.pwnpub.pojo;

/**
 * @author Giannis
 * @date 2020-08-30 21:08
 * @desc 交易pojo
 */
public class Transaction {

    private Integer id;

    private String type;

    private String time;

    private String txHash;

    private Integer value;

    public Transaction() {
    }

    public Transaction(Integer id, String type, String time, String txHash, Integer value) {
        this.id = id;
        this.type = type;
        this.time = time;
        this.txHash = txHash;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTxHash() {
        return txHash;
    }

    public void setTxHash(String txHash) {
        this.txHash = txHash;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
