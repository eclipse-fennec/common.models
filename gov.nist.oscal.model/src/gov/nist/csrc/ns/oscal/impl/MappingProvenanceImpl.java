/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.ConfidenceScore;
import gov.nist.csrc.ns.oscal.Coverage;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MappingProvenance;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.ResponsibleParty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Provenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingProvenanceImpl#getConfidenceScore <em>Confidence Score</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingProvenanceImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingProvenanceImpl#getMappingDescription <em>Mapping Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingProvenanceImpl#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingProvenanceImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingProvenanceImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingProvenanceImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingProvenanceImpl#getMatchingRationale <em>Matching Rationale</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingProvenanceImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingProvenanceImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingProvenanceImpl extends MinimalEObjectImpl.Container implements MappingProvenance {
	/**
	 * The cached value of the '{@link #getConfidenceScore() <em>Confidence Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidenceScore()
	 * @generated
	 * @ordered
	 */
	protected ConfidenceScore confidenceScore;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected Coverage coverage;

	/**
	 * The default value of the '{@link #getMappingDescription() <em>Mapping Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPING_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappingDescription() <em>Mapping Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingDescription()
	 * @generated
	 * @ordered
	 */
	protected String mappingDescription = MAPPING_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponsibleParty() <em>Responsible Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParty()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibleParty> responsibleParty;

	/**
	 * The cached value of the '{@link #getProp() <em>Prop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProp()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> prop;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchingRationale() <em>Matching Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCHING_RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchingRationale() <em>Matching Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingRationale()
	 * @generated
	 * @ordered
	 */
	protected String matchingRationale = MATCHING_RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingProvenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getMappingProvenance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidenceScore getConfidenceScore() {
		return confidenceScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidenceScore(ConfidenceScore newConfidenceScore, NotificationChain msgs) {
		ConfidenceScore oldConfidenceScore = confidenceScore;
		confidenceScore = newConfidenceScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING_PROVENANCE__CONFIDENCE_SCORE, oldConfidenceScore, newConfidenceScore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidenceScore(ConfidenceScore newConfidenceScore) {
		if (newConfidenceScore != confidenceScore) {
			NotificationChain msgs = null;
			if (confidenceScore != null)
				msgs = ((InternalEObject)confidenceScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING_PROVENANCE__CONFIDENCE_SCORE, null, msgs);
			if (newConfidenceScore != null)
				msgs = ((InternalEObject)newConfidenceScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING_PROVENANCE__CONFIDENCE_SCORE, null, msgs);
			msgs = basicSetConfidenceScore(newConfidenceScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING_PROVENANCE__CONFIDENCE_SCORE, newConfidenceScore, newConfidenceScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coverage getCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(Coverage newCoverage, NotificationChain msgs) {
		Coverage oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING_PROVENANCE__COVERAGE, oldCoverage, newCoverage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoverage(Coverage newCoverage) {
		if (newCoverage != coverage) {
			NotificationChain msgs = null;
			if (coverage != null)
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING_PROVENANCE__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING_PROVENANCE__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING_PROVENANCE__COVERAGE, newCoverage, newCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMappingDescription() {
		return mappingDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappingDescription(String newMappingDescription) {
		String oldMappingDescription = mappingDescription;
		mappingDescription = newMappingDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING_PROVENANCE__MAPPING_DESCRIPTION, oldMappingDescription, mappingDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponsibleParty> getResponsibleParty() {
		if (responsibleParty == null) {
			responsibleParty = new EObjectContainmentEList<ResponsibleParty>(ResponsibleParty.class, this, OSCALPackage.MAPPING_PROVENANCE__RESPONSIBLE_PARTY);
		}
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.MAPPING_PROVENANCE__PROP);
		}
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.MAPPING_PROVENANCE__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING_PROVENANCE__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMatchingRationale() {
		return matchingRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchingRationale(String newMatchingRationale) {
		String oldMatchingRationale = matchingRationale;
		matchingRationale = newMatchingRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING_PROVENANCE__MATCHING_RATIONALE, oldMatchingRationale, matchingRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING_PROVENANCE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING_PROVENANCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.MAPPING_PROVENANCE__CONFIDENCE_SCORE:
				return basicSetConfidenceScore(null, msgs);
			case OSCALPackage.MAPPING_PROVENANCE__COVERAGE:
				return basicSetCoverage(null, msgs);
			case OSCALPackage.MAPPING_PROVENANCE__RESPONSIBLE_PARTY:
				return ((InternalEList<?>)getResponsibleParty()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MAPPING_PROVENANCE__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MAPPING_PROVENANCE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.MAPPING_PROVENANCE__CONFIDENCE_SCORE:
				return getConfidenceScore();
			case OSCALPackage.MAPPING_PROVENANCE__COVERAGE:
				return getCoverage();
			case OSCALPackage.MAPPING_PROVENANCE__MAPPING_DESCRIPTION:
				return getMappingDescription();
			case OSCALPackage.MAPPING_PROVENANCE__RESPONSIBLE_PARTY:
				return getResponsibleParty();
			case OSCALPackage.MAPPING_PROVENANCE__PROP:
				return getProp();
			case OSCALPackage.MAPPING_PROVENANCE__LINK:
				return getLink();
			case OSCALPackage.MAPPING_PROVENANCE__REMARKS:
				return getRemarks();
			case OSCALPackage.MAPPING_PROVENANCE__MATCHING_RATIONALE:
				return getMatchingRationale();
			case OSCALPackage.MAPPING_PROVENANCE__METHOD:
				return getMethod();
			case OSCALPackage.MAPPING_PROVENANCE__STATUS:
				return getStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OSCALPackage.MAPPING_PROVENANCE__CONFIDENCE_SCORE:
				setConfidenceScore((ConfidenceScore)newValue);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__MAPPING_DESCRIPTION:
				setMappingDescription((String)newValue);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				getResponsibleParty().addAll((Collection<? extends ResponsibleParty>)newValue);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__MATCHING_RATIONALE:
				setMatchingRationale((String)newValue);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__METHOD:
				setMethod((String)newValue);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__STATUS:
				setStatus((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OSCALPackage.MAPPING_PROVENANCE__CONFIDENCE_SCORE:
				setConfidenceScore((ConfidenceScore)null);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__MAPPING_DESCRIPTION:
				setMappingDescription(MAPPING_DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				return;
			case OSCALPackage.MAPPING_PROVENANCE__PROP:
				getProp().clear();
				return;
			case OSCALPackage.MAPPING_PROVENANCE__LINK:
				getLink().clear();
				return;
			case OSCALPackage.MAPPING_PROVENANCE__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__MATCHING_RATIONALE:
				setMatchingRationale(MATCHING_RATIONALE_EDEFAULT);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case OSCALPackage.MAPPING_PROVENANCE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OSCALPackage.MAPPING_PROVENANCE__CONFIDENCE_SCORE:
				return confidenceScore != null;
			case OSCALPackage.MAPPING_PROVENANCE__COVERAGE:
				return coverage != null;
			case OSCALPackage.MAPPING_PROVENANCE__MAPPING_DESCRIPTION:
				return MAPPING_DESCRIPTION_EDEFAULT == null ? mappingDescription != null : !MAPPING_DESCRIPTION_EDEFAULT.equals(mappingDescription);
			case OSCALPackage.MAPPING_PROVENANCE__RESPONSIBLE_PARTY:
				return responsibleParty != null && !responsibleParty.isEmpty();
			case OSCALPackage.MAPPING_PROVENANCE__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.MAPPING_PROVENANCE__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.MAPPING_PROVENANCE__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.MAPPING_PROVENANCE__MATCHING_RATIONALE:
				return MATCHING_RATIONALE_EDEFAULT == null ? matchingRationale != null : !MATCHING_RATIONALE_EDEFAULT.equals(matchingRationale);
			case OSCALPackage.MAPPING_PROVENANCE__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case OSCALPackage.MAPPING_PROVENANCE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mappingDescription: ");
		result.append(mappingDescription);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", matchingRationale: ");
		result.append(matchingRationale);
		result.append(", method: ");
		result.append(method);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //MappingProvenanceImpl
