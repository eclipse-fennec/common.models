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
import gov.nist.csrc.ns.oscal.MapEntry;
import gov.nist.csrc.ns.oscal.MappingItem;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.QualifierItem;

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
 * An implementation of the model object '<em><b>Map Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl#getConfidenceScore <em>Confidence Score</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl#getMatchingRationale <em>Matching Rationale</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl#getNs <em>Ns</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapEntryImpl extends MinimalEObjectImpl.Container implements MapEntry {
	/**
	 * The default value of the '{@link #getRelationship() <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected String relationship = RELATIONSHIP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingItem> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingItem> target;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<QualifierItem> qualifier;

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
	 * The default value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected String ns = NS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getMapEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationship(String newRelationship) {
		String oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAP_ENTRY__RELATIONSHIP, oldRelationship, relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MappingItem> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<MappingItem>(MappingItem.class, this, OSCALPackage.MAP_ENTRY__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MappingItem> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<MappingItem>(MappingItem.class, this, OSCALPackage.MAP_ENTRY__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QualifierItem> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectContainmentEList<QualifierItem>(QualifierItem.class, this, OSCALPackage.MAP_ENTRY__QUALIFIER);
		}
		return qualifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MAP_ENTRY__CONFIDENCE_SCORE, oldConfidenceScore, newConfidenceScore);
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
				msgs = ((InternalEObject)confidenceScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAP_ENTRY__CONFIDENCE_SCORE, null, msgs);
			if (newConfidenceScore != null)
				msgs = ((InternalEObject)newConfidenceScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAP_ENTRY__CONFIDENCE_SCORE, null, msgs);
			msgs = basicSetConfidenceScore(newConfidenceScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAP_ENTRY__CONFIDENCE_SCORE, newConfidenceScore, newConfidenceScore));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MAP_ENTRY__COVERAGE, oldCoverage, newCoverage);
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
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAP_ENTRY__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAP_ENTRY__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAP_ENTRY__COVERAGE, newCoverage, newCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.MAP_ENTRY__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.MAP_ENTRY__LINK);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAP_ENTRY__REMARKS, oldRemarks, remarks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAP_ENTRY__MATCHING_RATIONALE, oldMatchingRationale, matchingRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNs() {
		return ns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNs(String newNs) {
		String oldNs = ns;
		ns = newNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAP_ENTRY__NS, oldNs, ns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAP_ENTRY__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.MAP_ENTRY__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MAP_ENTRY__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MAP_ENTRY__QUALIFIER:
				return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MAP_ENTRY__CONFIDENCE_SCORE:
				return basicSetConfidenceScore(null, msgs);
			case OSCALPackage.MAP_ENTRY__COVERAGE:
				return basicSetCoverage(null, msgs);
			case OSCALPackage.MAP_ENTRY__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MAP_ENTRY__LINK:
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
			case OSCALPackage.MAP_ENTRY__RELATIONSHIP:
				return getRelationship();
			case OSCALPackage.MAP_ENTRY__SOURCE:
				return getSource();
			case OSCALPackage.MAP_ENTRY__TARGET:
				return getTarget();
			case OSCALPackage.MAP_ENTRY__QUALIFIER:
				return getQualifier();
			case OSCALPackage.MAP_ENTRY__CONFIDENCE_SCORE:
				return getConfidenceScore();
			case OSCALPackage.MAP_ENTRY__COVERAGE:
				return getCoverage();
			case OSCALPackage.MAP_ENTRY__PROP:
				return getProp();
			case OSCALPackage.MAP_ENTRY__LINK:
				return getLink();
			case OSCALPackage.MAP_ENTRY__REMARKS:
				return getRemarks();
			case OSCALPackage.MAP_ENTRY__MATCHING_RATIONALE:
				return getMatchingRationale();
			case OSCALPackage.MAP_ENTRY__NS:
				return getNs();
			case OSCALPackage.MAP_ENTRY__UUID:
				return getUuid();
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
			case OSCALPackage.MAP_ENTRY__RELATIONSHIP:
				setRelationship((String)newValue);
				return;
			case OSCALPackage.MAP_ENTRY__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends MappingItem>)newValue);
				return;
			case OSCALPackage.MAP_ENTRY__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends MappingItem>)newValue);
				return;
			case OSCALPackage.MAP_ENTRY__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends QualifierItem>)newValue);
				return;
			case OSCALPackage.MAP_ENTRY__CONFIDENCE_SCORE:
				setConfidenceScore((ConfidenceScore)newValue);
				return;
			case OSCALPackage.MAP_ENTRY__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case OSCALPackage.MAP_ENTRY__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.MAP_ENTRY__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.MAP_ENTRY__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.MAP_ENTRY__MATCHING_RATIONALE:
				setMatchingRationale((String)newValue);
				return;
			case OSCALPackage.MAP_ENTRY__NS:
				setNs((String)newValue);
				return;
			case OSCALPackage.MAP_ENTRY__UUID:
				setUuid((String)newValue);
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
			case OSCALPackage.MAP_ENTRY__RELATIONSHIP:
				setRelationship(RELATIONSHIP_EDEFAULT);
				return;
			case OSCALPackage.MAP_ENTRY__SOURCE:
				getSource().clear();
				return;
			case OSCALPackage.MAP_ENTRY__TARGET:
				getTarget().clear();
				return;
			case OSCALPackage.MAP_ENTRY__QUALIFIER:
				getQualifier().clear();
				return;
			case OSCALPackage.MAP_ENTRY__CONFIDENCE_SCORE:
				setConfidenceScore((ConfidenceScore)null);
				return;
			case OSCALPackage.MAP_ENTRY__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case OSCALPackage.MAP_ENTRY__PROP:
				getProp().clear();
				return;
			case OSCALPackage.MAP_ENTRY__LINK:
				getLink().clear();
				return;
			case OSCALPackage.MAP_ENTRY__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.MAP_ENTRY__MATCHING_RATIONALE:
				setMatchingRationale(MATCHING_RATIONALE_EDEFAULT);
				return;
			case OSCALPackage.MAP_ENTRY__NS:
				setNs(NS_EDEFAULT);
				return;
			case OSCALPackage.MAP_ENTRY__UUID:
				setUuid(UUID_EDEFAULT);
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
			case OSCALPackage.MAP_ENTRY__RELATIONSHIP:
				return RELATIONSHIP_EDEFAULT == null ? relationship != null : !RELATIONSHIP_EDEFAULT.equals(relationship);
			case OSCALPackage.MAP_ENTRY__SOURCE:
				return source != null && !source.isEmpty();
			case OSCALPackage.MAP_ENTRY__TARGET:
				return target != null && !target.isEmpty();
			case OSCALPackage.MAP_ENTRY__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case OSCALPackage.MAP_ENTRY__CONFIDENCE_SCORE:
				return confidenceScore != null;
			case OSCALPackage.MAP_ENTRY__COVERAGE:
				return coverage != null;
			case OSCALPackage.MAP_ENTRY__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.MAP_ENTRY__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.MAP_ENTRY__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.MAP_ENTRY__MATCHING_RATIONALE:
				return MATCHING_RATIONALE_EDEFAULT == null ? matchingRationale != null : !MATCHING_RATIONALE_EDEFAULT.equals(matchingRationale);
			case OSCALPackage.MAP_ENTRY__NS:
				return NS_EDEFAULT == null ? ns != null : !NS_EDEFAULT.equals(ns);
			case OSCALPackage.MAP_ENTRY__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
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
		result.append(" (relationship: ");
		result.append(relationship);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", matchingRationale: ");
		result.append(matchingRationale);
		result.append(", ns: ");
		result.append(ns);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //MapEntryImpl
