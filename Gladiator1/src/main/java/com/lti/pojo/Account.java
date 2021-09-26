package com.lti.pojo;

import javax.persistence.*;

@Entity
	@Table(name = "ACCOUNTGLAD")
public class Account {
		@Id
		@GeneratedValue
		@Column(name = "ACCID")
		private int accId;

		@Column(name = "PASS")
		private String pass;

		@Column(name = "TXPASS")
		private String txPass;

		@Column(name = "ATTEMPT")
		private int attempt;

		@OneToOne
		@JoinColumn(name = "ACCNO")
		private Account acc;

		public int getAccId() {
			return accId;
		}

		public void setAccId(int accId) {
			this.accId = accId;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

		public String getTxPass() {
			return txPass;
		}

		public void setTxPass(String txPass) {
			this.txPass = txPass;
		}

		public int getAttempt() {
			return attempt;
		}

		public void setAttempt(int attempt) {
			this.attempt = attempt;
		}

		public Account getAcc() {
			return acc;
		}

		public void setAcc(Account acc) {
			this.acc = acc;
		}
		
}
