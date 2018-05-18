package com.example.mystore.model;
 
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PRODUCTS")
@Entity
public class Product {
 
	private Long hjmpts;
	
	private Date createdts;
	
	private Date modifiedts;
	
	private Long typepkstring;
	
	private Long ownerpkstring;
	
	@Id
	@Column(name="PK")
	private Long id;
	
	@Column(name="P_CODE", nullable=false)
	private String code;
	 
	@Column(name="P_UNIT")
	private Long unit;
	 
	@Column(name="P_THUMBNAIL")
	private Long thumbnail;
	
	@Column(name="P_PICTURE")	
	private Long picture;
	
	@Column(name="P_CATALOG") 
	private Long catalog;
	
	@Column(name="P_CATALOGVERSION")
	private Long catalogVersion;
	
	@Column(name="P_ONLINEDATE", nullable=false)
	private Date onlineDate;
	  
	@Column(name="P_OFFLINEDATE", nullable=false)
	private Date offLineDate;
	
	@Column(name="P_EAN")
	private String ean; 
	
	@Column(name="P_SUPPLIERALTERNATIVEAID")
	private String supplierAlternativeAid;
	
	@Column(name="P_BUYERIDS")	
	private byte[] buyersIds;  
	
	@Column(name="P_MANUFACTURERAID")	
	private String manufacturerAid;  
	
	@Column(name="P_MANUFACTURERNAME")
	private String manufacturerName;
	 
	@Column(name="P_ERPGROUPBUYER")
	private String erpGroupBuyer;
	
	@Column(name="P_ERPGROUPSUPPLIER")
	private String erpGroupSupplier;
	  
    @Column(name="P_DELIVERYTIME")
	private Double deliveryTime;
	
    @Column(name="P_SPECIALTREATMENTCLASSES")
    private byte[] specialTreatmentClasses;
    
    @Column(name="P_ORDER")
    private Integer order;   
    
    @Column(name="P_APPROVALSTATUS")
	private Long approvalStatus;
  
    @Column(name="P_CONTENTUNIT")
	private Long contentUnit;
    
    @Column(name="P_NUMBERCONTENTUNITS")
    private Double numberContentUnits;
	    
    @Column(name="P_MINORDERQUANTITY")
    private Integer minorOrderQuantity;
    
    @Column(name="P_MAXORDERQUANTITY")
    private Integer maxOrderQuantity;
     
    @Column(name="P_ORDERQUANTITYINTERVAL")
    private Integer orderQuantityInterval;
   
    @Column(name="P_PRICEQUANTITY")
    private Double priceQuantity;
     
    @Column(name="P_NORMAL")  
    private String normal;
    
    @Column(name="P_THUMBNAILS")   
    private String thumbnails;  
	 
    @Column(name="P_DETAIL")
    private String detail;
    
    @Column(name="P_LOGO")
    private String logo;
    
    @Column(name="P_DATA_SHEET")
    private String dataSheet;
     
    @Column(name="P_OTHERS")
    private String others;
	  
    @Column(name="P_STARTLINENUMBER")    
    private Integer startLineNumber;
    
    @Column(name="P_ENDLINENUMBER")
    private Integer endLineNumber;
    
    @Column(name="P_VARIANTTYPE")
    private Long varianttype;
    
    @Column(name="P_EUROPE1PRICEFACTORY_PPG")
    private Long europe1PriceFactoryPPG;
    
    @Column(name="P_EUROPE1PRICEFACTORY_PTG")
    private Long europe1PriceFactoryPTG;
    
    @Column(name="P_EUROPE1PRICEFACTORY_PDG")
    private Long europe1PriceFactoryPDG;
    
	@Column(name="P_BAND") 
    private Long band;
	
	private Long aclts;
	
	private Long propts;
	  
	@Column(name="P_BASEPRODUCT") 
    private Long baseProduct;
	 
	@Column(name="P_VENUE") 
    private String venue;
	
	@Column(name="P_DATE") 
    private Date pdate;
	 
	@Column(name="P_CONCERTTYPE") 
	private Long concertType;

	public Long getHjmpts() {
		return hjmpts;
	}

	public void setHjmpts(Long hjmpts) {
		this.hjmpts = hjmpts;
	}

	public Date getCreatedts() {
		return createdts;
	}

	public void setCreatedts(Date createdts) {
		this.createdts = createdts;
	}

	public Date getModifiedts() {
		return modifiedts;
	}

	public void setModifiedts(Date modifiedts) {
		this.modifiedts = modifiedts;
	}

	public Long getTypepkstring() {
		return typepkstring;
	}

	public void setTypepkstring(Long typepkstring) {
		this.typepkstring = typepkstring;
	}

	public Long getOwnerpkstring() {
		return ownerpkstring;
	}

	public void setOwnerpkstring(Long ownerpkstring) {
		this.ownerpkstring = ownerpkstring;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getUnit() {
		return unit;
	}

	public void setUnit(Long unit) {
		this.unit = unit;
	}

	public Long getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(Long thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Long getPicture() {
		return picture;
	}

	public void setPicture(Long picture) {
		this.picture = picture;
	}

	public Long getCatalog() {
		return catalog;
	}

	public void setCatalog(Long catalog) {
		this.catalog = catalog;
	}

	public Long getCatalogVersion() {
		return catalogVersion;
	}

	public void setCatalogVersion(Long catalogVersion) {
		this.catalogVersion = catalogVersion;
	}

	public Date getOnlineDate() {
		return onlineDate;
	}

	public void setOnlineDate(Date onlineDate) {
		this.onlineDate = onlineDate;
	}

	public Date getOffLineDate() {
		return offLineDate;
	}

	public void setOffLineDate(Date offLineDate) {
		this.offLineDate = offLineDate;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getSupplierAlternativeAid() {
		return supplierAlternativeAid;
	}

	public void setSupplierAlternativeAid(String supplierAlternativeAid) {
		this.supplierAlternativeAid = supplierAlternativeAid;
	}

	public byte[] getBuyersIds() {
		return buyersIds;
	}

	public void setBuyersIds(byte[] buyersIds) {
		this.buyersIds = buyersIds;
	}

	public String getManufacturerAid() {
		return manufacturerAid;
	}

	public void setManufacturerAid(String manufacturerAid) {
		this.manufacturerAid = manufacturerAid;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getErpGroupBuyer() {
		return erpGroupBuyer;
	}

	public void setErpGroupBuyer(String erpGroupBuyer) {
		this.erpGroupBuyer = erpGroupBuyer;
	}

	public String getErpGroupSupplier() {
		return erpGroupSupplier;
	}

	public void setErpGroupSupplier(String erpGroupSupplier) {
		this.erpGroupSupplier = erpGroupSupplier;
	}

	public Double getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Double deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public byte[] getSpecialTreatmentClasses() {
		return specialTreatmentClasses;
	}

	public void setSpecialTreatmentClasses(byte[] specialTreatmentClasses) {
		this.specialTreatmentClasses = specialTreatmentClasses;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Long getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(Long approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public Long getContentUnit() {
		return contentUnit;
	}

	public void setContentUnit(Long contentUnit) {
		this.contentUnit = contentUnit;
	}

	public Double getNumberContentUnits() {
		return numberContentUnits;
	}

	public void setNumberContentUnits(Double numberContentUnits) {
		this.numberContentUnits = numberContentUnits;
	}

	public Integer getMinorOrderQuantity() {
		return minorOrderQuantity;
	}

	public void setMinorOrderQuantity(Integer minorOrderQuantity) {
		this.minorOrderQuantity = minorOrderQuantity;
	}

	public Integer getMaxOrderQuantity() {
		return maxOrderQuantity;
	}

	public void setMaxOrderQuantity(Integer maxOrderQuantity) {
		this.maxOrderQuantity = maxOrderQuantity;
	}

	public Integer getOrderQuantityInterval() {
		return orderQuantityInterval;
	}

	public void setOrderQuantityInterval(Integer orderQuantityInterval) {
		this.orderQuantityInterval = orderQuantityInterval;
	}

	public Double getPriceQuantity() {
		return priceQuantity;
	}

	public void setPriceQuantity(Double priceQuantity) {
		this.priceQuantity = priceQuantity;
	}

	public String getNormal() {
		return normal;
	}

	public void setNormal(String normal) {
		this.normal = normal;
	}

	public String getThumbnails() {
		return thumbnails;
	}

	public void setThumbnails(String thumbnails) {
		this.thumbnails = thumbnails;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getDataSheet() {
		return dataSheet;
	}

	public void setDataSheet(String dataSheet) {
		this.dataSheet = dataSheet;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public Integer getStartLineNumber() {
		return startLineNumber;
	}

	public void setStartLineNumber(Integer startLineNumber) {
		this.startLineNumber = startLineNumber;
	}

	public Integer getEndLineNumber() {
		return endLineNumber;
	}

	public void setEndLineNumber(Integer endLineNumber) {
		this.endLineNumber = endLineNumber;
	}

	public Long getVarianttype() {
		return varianttype;
	}

	public void setVarianttype(Long varianttype) {
		this.varianttype = varianttype;
	}

	public Long getEurope1PriceFactoryPPG() {
		return europe1PriceFactoryPPG;
	}

	public void setEurope1PriceFactoryPPG(Long europe1PriceFactoryPPG) {
		this.europe1PriceFactoryPPG = europe1PriceFactoryPPG;
	}

	public Long getEurope1PriceFactoryPTG() {
		return europe1PriceFactoryPTG;
	}

	public void setEurope1PriceFactoryPTG(Long europe1PriceFactoryPTG) {
		this.europe1PriceFactoryPTG = europe1PriceFactoryPTG;
	}

	public Long getEurope1PriceFactoryPDG() {
		return europe1PriceFactoryPDG;
	}

	public void setEurope1PriceFactoryPDG(Long europe1PriceFactoryPDG) {
		this.europe1PriceFactoryPDG = europe1PriceFactoryPDG;
	}

	public Long getBand() {
		return band;
	}

	public void setBand(Long band) {
		this.band = band;
	}

	public Long getAclts() {
		return aclts;
	}

	public void setAclts(Long aclts) {
		this.aclts = aclts;
	}

	public Long getPropts() {
		return propts;
	}

	public void setPropts(Long propts) {
		this.propts = propts;
	}

	public Long getBaseProduct() {
		return baseProduct;
	}

	public void setBaseProduct(Long baseProduct) {
		this.baseProduct = baseProduct;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public Long getConcertType() {
		return concertType;
	}

	public void setConcertType(Long concertType) {
		this.concertType = concertType;
	}
 
}
