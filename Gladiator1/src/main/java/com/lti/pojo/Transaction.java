package com.lti.pojo;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "TRANSACTIONGLAD")
public class Transaction {

	@Id
	@GeneratedValue
	@Column(name = "TXID")
	private int txId;

	@Column(name = "TXDETAILS")
	private String txDetails;

	@Column(name = "TXDATE")
	private LocalDateTime txDate;

	@Column(name = "TXTYPE")
	private String txType;

	@Column(name = "TXAMOUNT")
	private String txAmount;

	@Column(name = "TXBAL")
	private String txbal;

	@ManyToOne
	@JoinColumn(name = "ACCNO")
	private Account account;

	public int getTxId() {
		return txId;
	}

	public void setTxId(int txId) {
		this.txId = txId;
	}

	public String getTxDetails() {
		return txDetails;
	}

	public void setTxDetails(String txDetails) {
		this.txDetails = txDetails;
	}

	public LocalDateTime getTxDate() {
		return txDate;
	}

	public void setTxDate(LocalDateTime txDate) {
		this.txDate = txDate;
	}

	public String getTxType() {
		return txType;
	}

	public void setTxType(String txType) {
		this.txType = txType;
	}

	public String getTxAmount() {
		return txAmount;
	}

	public void setTxAmount(String txAmount) {
		this.txAmount = txAmount;
	}

	public String getTxbal() {
		return txbal;
	}

	public void setTxbal(String txbal) {
		this.txbal = txbal;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
		


}