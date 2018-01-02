package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_download_description")
public class DownloadDescription extends BaseEntity {
	
	@Id
	@Column(name = "download_description_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "download_id")
	private Download download;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	private String name;
		
	@Transient
	private Long downloadId;
	@Transient
	private Long languageId;
	
	public DownloadDescription() {}
	
	public DownloadDescription(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Download getDownload() {
		return download;
	}

	public void setDownload(Download download) {
		this.download = download;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}

	public Long getDownloadId() {
		return downloadId;
	}

	public void setDownloadId(Long downloadId) {
		this.downloadId = downloadId;
		this.setDownload(new Download(downloadId));
	}
}
