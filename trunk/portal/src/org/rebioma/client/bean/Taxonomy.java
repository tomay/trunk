package org.rebioma.client.bean;

// Generated 26 ao�t 2012 20:34:47 by Hibernate Tools 3.3.0.GA

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Taxonomy generated by hbm2java
 */
public class Taxonomy implements java.io.Serializable {

	private int id;
	private Double taId;
	private Double idAccepted;
	private String nomenclaturalCode;
	private String kingdom;
	private String kingdomSource;
	private String phylum;
	private String phylumSource;
	private String subPhylum;
	private String subPhylumSource;
	private String class_;
	private String classSource;
	private String subclass;
	private String subclassSource;
	private String superOrder;
	private String superOrderSource;
	private String order;
	private String orderSource;
	private String suborder;
	private String suborderSource;
	private String infraOrder;
	private String infraOrderSource;
	private String superFamily;
	private String superfamilySource;
	private String family;
	private String familySource;
	private String subfamily;
	private String subfamilySource;
	private String genus;
	private String genusSource;
	private String subgenus;
	private String subgenusSource;
	private String specificEpithet;
	private String specificEpithetSource;
	private String infraspecificRank;
	private String infraspecificEpithet;
	private String infraspecificEpithetSource;
	private String acceptedSpecies;
	private String verbatimSpecies;
	private String verbatimSpeciesSource;
	private Double isMarine;
	private Double isTerrestrial;
	private String comments;
	private String reviewedBy;
	private String reviewDate;
	private String notes;
	private String status;
	private String changedBy;
	private Date changeDate;
	private String validation;
	private String validatedBy;
	private Date validationDate;
	private Double stability;
	
	public static List<String> COLONNE_DOUBLE = Arrays.asList("Stability", "IsTerrestrial", "IsMarine","TaId","IdAccepted");
	public static List<String> COLONNE_DATE = Arrays.asList("ValidationDate", "ChangeDate");

	public Taxonomy() {
	}

	public Taxonomy(int id) {		
		this.id = id;
	}

	public Taxonomy(int id, Double taId, Double idAccepted,
			String nomenclaturalCode, String kingdom, String kingdomSource,
			String phylum, String phylumSource, String subPhylum,
			String subPhylumSource, String class_, String classSource,
			String subclass, String subclassSource, String superOrder,
			String superOrderSource, String order, String orderSource,
			String suborder, String suborderSource, String infraOrder,
			String infraOrderSource, String superFamily,
			String superfamilySource, String family, String familySource,
			String subfamily, String subfamilySource, String genus,
			String genusSource, String subgenus, String subgenusSource,
			String specificEpithet, String specificEpithetSource,
			String infraspecificRank, String infraspecificEpithet,
			String infraspecificEpithetSource, String acceptedSpecies,
			String verbatimSpecies, String verbatimSpeciesSource,
			Double isMarine, Double isTerrestrial, String comments,
			String reviewedBy, String reviewDate, String notes, String status,
			String changedBy, Date changeDate, String validation,
			String validatedBy, Date validationDate, Double stability) {
		this.id = id;
		this.taId = taId;
		this.idAccepted = idAccepted;
		this.nomenclaturalCode = nomenclaturalCode;
		this.kingdom = kingdom;
		this.kingdomSource = kingdomSource;
		this.phylum = phylum;
		this.phylumSource = phylumSource;
		this.subPhylum = subPhylum;
		this.subPhylumSource = subPhylumSource;
		this.class_ = class_;
		this.classSource = classSource;
		this.subclass = subclass;
		this.subclassSource = subclassSource;
		this.superOrder = superOrder;
		this.superOrderSource = superOrderSource;
		this.order = order;
		this.orderSource = orderSource;
		this.suborder = suborder;
		this.suborderSource = suborderSource;
		this.infraOrder = infraOrder;
		this.infraOrderSource = infraOrderSource;
		this.superFamily = superFamily;
		this.superfamilySource = superfamilySource;
		this.family = family;
		this.familySource = familySource;
		this.subfamily = subfamily;
		this.subfamilySource = subfamilySource;
		this.genus = genus;
		this.genusSource = genusSource;
		this.subgenus = subgenus;
		this.subgenusSource = subgenusSource;
		this.specificEpithet = specificEpithet;
		this.specificEpithetSource = specificEpithetSource;
		this.infraspecificRank = infraspecificRank;
		this.infraspecificEpithet = infraspecificEpithet;
		this.infraspecificEpithetSource = infraspecificEpithetSource;
		this.acceptedSpecies = acceptedSpecies;
		this.verbatimSpecies = verbatimSpecies;
		this.verbatimSpeciesSource = verbatimSpeciesSource;
		this.isMarine = isMarine;
		this.isTerrestrial = isTerrestrial;
		this.comments = comments;
		this.reviewedBy = reviewedBy;
		this.reviewDate = reviewDate;
		this.notes = notes;
		this.status = status;
		this.changedBy = changedBy;
		this.changeDate = changeDate;
		this.validation = validation;
		this.validatedBy = validatedBy;
		this.validationDate = validationDate;
		this.stability = stability;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getTaId() {
		return this.taId;
	}

	public void setTaId(Double taId) {
		this.taId = taId;
	}

	public Double getIdAccepted() {
		return this.idAccepted;
	}

	public void setIdAccepted(Double idAccepted) {
		this.idAccepted = idAccepted;
	}

	public String getNomenclaturalCode() {
		return this.nomenclaturalCode;
	}

	public void setNomenclaturalCode(String nomenclaturalCode) {
		this.nomenclaturalCode = nomenclaturalCode;
	}

	public String getKingdom() {
		return this.kingdom;
	}

	public void setKingdom(String kingdom) {
		this.kingdom = kingdom;
	}

	public String getKingdomSource() {
		return this.kingdomSource;
	}

	public void setKingdomSource(String kingdomSource) {
		this.kingdomSource = kingdomSource;
	}

	public String getPhylum() {
		return this.phylum;
	}

	public void setPhylum(String phylum) {
		this.phylum = phylum;
	}

	public String getPhylumSource() {
		return this.phylumSource;
	}

	public void setPhylumSource(String phylumSource) {
		this.phylumSource = phylumSource;
	}

	public String getSubPhylum() {
		return this.subPhylum;
	}

	public void setSubPhylum(String subPhylum) {
		this.subPhylum = subPhylum;
	}

	public String getSubPhylumSource() {
		return this.subPhylumSource;
	}

	public void setSubPhylumSource(String subPhylumSource) {
		this.subPhylumSource = subPhylumSource;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getClassSource() {
		return this.classSource;
	}

	public void setClassSource(String classSource) {
		this.classSource = classSource;
	}

	public String getSubclass() {
		return this.subclass;
	}

	public void setSubclass(String subclass) {
		this.subclass = subclass;
	}

	public String getSubclassSource() {
		return this.subclassSource;
	}

	public void setSubclassSource(String subclassSource) {
		this.subclassSource = subclassSource;
	}

	public String getSuperOrder() {
		return this.superOrder;
	}

	public void setSuperOrder(String superOrder) {
		this.superOrder = superOrder;
	}

	public String getSuperOrderSource() {
		return this.superOrderSource;
	}

	public void setSuperOrderSource(String superOrderSource) {
		this.superOrderSource = superOrderSource;
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getOrderSource() {
		return this.orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getSuborder() {
		return this.suborder;
	}

	public void setSuborder(String suborder) {
		this.suborder = suborder;
	}

	public String getSuborderSource() {
		return this.suborderSource;
	}

	public void setSuborderSource(String suborderSource) {
		this.suborderSource = suborderSource;
	}

	public String getInfraOrder() {
		return this.infraOrder;
	}

	public void setInfraOrder(String infraOrder) {
		this.infraOrder = infraOrder;
	}

	public String getInfraOrderSource() {
		return this.infraOrderSource;
	}

	public void setInfraOrderSource(String infraOrderSource) {
		this.infraOrderSource = infraOrderSource;
	}

	public String getSuperFamily() {
		return this.superFamily;
	}

	public void setSuperFamily(String superFamily) {
		this.superFamily = superFamily;
	}

	public String getSuperfamilySource() {
		return this.superfamilySource;
	}

	public void setSuperfamilySource(String superfamilySource) {
		this.superfamilySource = superfamilySource;
	}

	public String getFamily() {
		return this.family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getFamilySource() {
		return this.familySource;
	}

	public void setFamilySource(String familySource) {
		this.familySource = familySource;
	}

	public String getSubfamily() {
		return this.subfamily;
	}

	public void setSubfamily(String subfamily) {
		this.subfamily = subfamily;
	}

	public String getSubfamilySource() {
		return this.subfamilySource;
	}

	public void setSubfamilySource(String subfamilySource) {
		this.subfamilySource = subfamilySource;
	}

	public String getGenus() {
		return this.genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getGenusSource() {
		return this.genusSource;
	}

	public void setGenusSource(String genusSource) {
		this.genusSource = genusSource;
	}

	public String getSubgenus() {
		return this.subgenus;
	}

	public void setSubgenus(String subgenus) {
		this.subgenus = subgenus;
	}

	public String getSubgenusSource() {
		return this.subgenusSource;
	}

	public void setSubgenusSource(String subgenusSource) {
		this.subgenusSource = subgenusSource;
	}

	public String getSpecificEpithet() {
		return this.specificEpithet;
	}

	public void setSpecificEpithet(String specificEpithet) {
		this.specificEpithet = specificEpithet;
	}

	public String getSpecificEpithetSource() {
		return this.specificEpithetSource;
	}

	public void setSpecificEpithetSource(String specificEpithetSource) {
		this.specificEpithetSource = specificEpithetSource;
	}

	public String getInfraspecificRank() {
		return this.infraspecificRank;
	}

	public void setInfraspecificRank(String infraspecificRank) {
		this.infraspecificRank = infraspecificRank;
	}

	public String getInfraspecificEpithet() {
		return this.infraspecificEpithet;
	}

	public void setInfraspecificEpithet(String infraspecificEpithet) {
		this.infraspecificEpithet = infraspecificEpithet;
	}

	public String getInfraspecificEpithetSource() {
		return this.infraspecificEpithetSource;
	}

	public void setInfraspecificEpithetSource(String infraspecificEpithetSource) {
		this.infraspecificEpithetSource = infraspecificEpithetSource;
	}

	public String getAcceptedSpecies() {
		return this.acceptedSpecies;
	}

	public void setAcceptedSpecies(String acceptedSpecies) {
		this.acceptedSpecies = acceptedSpecies;
	}

	public String getVerbatimSpecies() {
		return this.verbatimSpecies;
	}

	public void setVerbatimSpecies(String verbatimSpecies) {
		this.verbatimSpecies = verbatimSpecies;
	}

	public String getVerbatimSpeciesSource() {
		return this.verbatimSpeciesSource;
	}

	public void setVerbatimSpeciesSource(String verbatimSpeciesSource) {
		this.verbatimSpeciesSource = verbatimSpeciesSource;
	}

	public Double getIsMarine() {
		return this.isMarine;
	}

	public void setIsMarine(Double isMarine) {
		this.isMarine = isMarine;
	}

	public Double getIsTerrestrial() {
		return this.isTerrestrial;
	}

	public void setIsTerrestrial(Double isTerrestrial) {
		this.isTerrestrial = isTerrestrial;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getReviewedBy() {
		return this.reviewedBy;
	}

	public void setReviewedBy(String reviewedBy) {
		this.reviewedBy = reviewedBy;
	}

	public String getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getChangedBy() {
		return this.changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public Date getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

	public String getValidation() {
		return this.validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}

	public String getValidatedBy() {
		return this.validatedBy;
	}

	public void setValidatedBy(String validatedBy) {
		this.validatedBy = validatedBy;
	}

	public Date getValidationDate() {
		return this.validationDate;
	}

	public void setValidationDate(Date validationDate) {
		this.validationDate = validationDate;
	}

	public Double getStability() {
		return this.stability;
	}

	public void setStability(Double stability) {
		this.stability = stability;
	}

}
