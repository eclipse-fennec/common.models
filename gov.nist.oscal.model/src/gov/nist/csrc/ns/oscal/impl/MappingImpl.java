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
import gov.nist.csrc.ns.oscal.GapSummary;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MapEntry;
import gov.nist.csrc.ns.oscal.Mapping;
import gov.nist.csrc.ns.oscal.MappingResourceReference;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;

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
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getSourceResource <em>Source Resource</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getTargetResource <em>Target Resource</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getMap <em>Map</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getMappingDescription <em>Mapping Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getSourceGapSummary <em>Source Gap Summary</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getTargetGapSummary <em>Target Gap Summary</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getConfidenceScore <em>Confidence Score</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getMatchingRationale <em>Matching Rationale</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MappingImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping {
	/**
	 * The cached value of the '{@link #getSourceResource() <em>Source Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceResource()
	 * @generated
	 * @ordered
	 */
	protected MappingResourceReference sourceResource;

	/**
	 * The cached value of the '{@link #getTargetResource() <em>Target Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetResource()
	 * @generated
	 * @ordered
	 */
	protected MappingResourceReference targetResource;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected EList<MapEntry> map;

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
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultilineDatatype remarks;

	/**
	 * The cached value of the '{@link #getMappingDescription() <em>Mapping Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingDescription()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultilineDatatype mappingDescription;

	/**
	 * The cached value of the '{@link #getSourceGapSummary() <em>Source Gap Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceGapSummary()
	 * @generated
	 * @ordered
	 */
	protected GapSummary sourceGapSummary;

	/**
	 * The cached value of the '{@link #getTargetGapSummary() <em>Target Gap Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGapSummary()
	 * @generated
	 * @ordered
	 */
	protected GapSummary targetGapSummary;

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
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingResourceReference getSourceResource() {
		return sourceResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceResource(MappingResourceReference newSourceResource, NotificationChain msgs) {
		MappingResourceReference oldSourceResource = sourceResource;
		sourceResource = newSourceResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__SOURCE_RESOURCE, oldSourceResource, newSourceResource);
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
	public void setSourceResource(MappingResourceReference newSourceResource) {
		if (newSourceResource != sourceResource) {
			NotificationChain msgs = null;
			if (sourceResource != null)
				msgs = ((InternalEObject)sourceResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__SOURCE_RESOURCE, null, msgs);
			if (newSourceResource != null)
				msgs = ((InternalEObject)newSourceResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__SOURCE_RESOURCE, null, msgs);
			msgs = basicSetSourceResource(newSourceResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__SOURCE_RESOURCE, newSourceResource, newSourceResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingResourceReference getTargetResource() {
		return targetResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetResource(MappingResourceReference newTargetResource, NotificationChain msgs) {
		MappingResourceReference oldTargetResource = targetResource;
		targetResource = newTargetResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__TARGET_RESOURCE, oldTargetResource, newTargetResource);
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
	public void setTargetResource(MappingResourceReference newTargetResource) {
		if (newTargetResource != targetResource) {
			NotificationChain msgs = null;
			if (targetResource != null)
				msgs = ((InternalEObject)targetResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__TARGET_RESOURCE, null, msgs);
			if (newTargetResource != null)
				msgs = ((InternalEObject)newTargetResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__TARGET_RESOURCE, null, msgs);
			msgs = basicSetTargetResource(newTargetResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__TARGET_RESOURCE, newTargetResource, newTargetResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MapEntry> getMap() {
		if (map == null) {
			map = new EObjectContainmentEList<MapEntry>(MapEntry.class, this, OSCALPackage.MAPPING__MAP);
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.MAPPING__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.MAPPING__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultilineDatatype getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemarks(MarkupMultilineDatatype newRemarks, NotificationChain msgs) {
		MarkupMultilineDatatype oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__REMARKS, oldRemarks, newRemarks);
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
	public void setRemarks(MarkupMultilineDatatype newRemarks) {
		if (newRemarks != remarks) {
			NotificationChain msgs = null;
			if (remarks != null)
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultilineDatatype getMappingDescription() {
		return mappingDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingDescription(MarkupMultilineDatatype newMappingDescription, NotificationChain msgs) {
		MarkupMultilineDatatype oldMappingDescription = mappingDescription;
		mappingDescription = newMappingDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__MAPPING_DESCRIPTION, oldMappingDescription, newMappingDescription);
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
	public void setMappingDescription(MarkupMultilineDatatype newMappingDescription) {
		if (newMappingDescription != mappingDescription) {
			NotificationChain msgs = null;
			if (mappingDescription != null)
				msgs = ((InternalEObject)mappingDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__MAPPING_DESCRIPTION, null, msgs);
			if (newMappingDescription != null)
				msgs = ((InternalEObject)newMappingDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__MAPPING_DESCRIPTION, null, msgs);
			msgs = basicSetMappingDescription(newMappingDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__MAPPING_DESCRIPTION, newMappingDescription, newMappingDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GapSummary getSourceGapSummary() {
		return sourceGapSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceGapSummary(GapSummary newSourceGapSummary, NotificationChain msgs) {
		GapSummary oldSourceGapSummary = sourceGapSummary;
		sourceGapSummary = newSourceGapSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__SOURCE_GAP_SUMMARY, oldSourceGapSummary, newSourceGapSummary);
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
	public void setSourceGapSummary(GapSummary newSourceGapSummary) {
		if (newSourceGapSummary != sourceGapSummary) {
			NotificationChain msgs = null;
			if (sourceGapSummary != null)
				msgs = ((InternalEObject)sourceGapSummary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__SOURCE_GAP_SUMMARY, null, msgs);
			if (newSourceGapSummary != null)
				msgs = ((InternalEObject)newSourceGapSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__SOURCE_GAP_SUMMARY, null, msgs);
			msgs = basicSetSourceGapSummary(newSourceGapSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__SOURCE_GAP_SUMMARY, newSourceGapSummary, newSourceGapSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GapSummary getTargetGapSummary() {
		return targetGapSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetGapSummary(GapSummary newTargetGapSummary, NotificationChain msgs) {
		GapSummary oldTargetGapSummary = targetGapSummary;
		targetGapSummary = newTargetGapSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__TARGET_GAP_SUMMARY, oldTargetGapSummary, newTargetGapSummary);
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
	public void setTargetGapSummary(GapSummary newTargetGapSummary) {
		if (newTargetGapSummary != targetGapSummary) {
			NotificationChain msgs = null;
			if (targetGapSummary != null)
				msgs = ((InternalEObject)targetGapSummary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__TARGET_GAP_SUMMARY, null, msgs);
			if (newTargetGapSummary != null)
				msgs = ((InternalEObject)newTargetGapSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__TARGET_GAP_SUMMARY, null, msgs);
			msgs = basicSetTargetGapSummary(newTargetGapSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__TARGET_GAP_SUMMARY, newTargetGapSummary, newTargetGapSummary));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__CONFIDENCE_SCORE, oldConfidenceScore, newConfidenceScore);
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
				msgs = ((InternalEObject)confidenceScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__CONFIDENCE_SCORE, null, msgs);
			if (newConfidenceScore != null)
				msgs = ((InternalEObject)newConfidenceScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__CONFIDENCE_SCORE, null, msgs);
			msgs = basicSetConfidenceScore(newConfidenceScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__CONFIDENCE_SCORE, newConfidenceScore, newConfidenceScore));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__COVERAGE, oldCoverage, newCoverage);
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
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MAPPING__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__COVERAGE, newCoverage, newCoverage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__MATCHING_RATIONALE, oldMatchingRationale, matchingRationale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__METHOD, oldMethod, method));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MAPPING__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.MAPPING__SOURCE_RESOURCE:
				return basicSetSourceResource(null, msgs);
			case OSCALPackage.MAPPING__TARGET_RESOURCE:
				return basicSetTargetResource(null, msgs);
			case OSCALPackage.MAPPING__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MAPPING__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MAPPING__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MAPPING__REMARKS:
				return basicSetRemarks(null, msgs);
			case OSCALPackage.MAPPING__MAPPING_DESCRIPTION:
				return basicSetMappingDescription(null, msgs);
			case OSCALPackage.MAPPING__SOURCE_GAP_SUMMARY:
				return basicSetSourceGapSummary(null, msgs);
			case OSCALPackage.MAPPING__TARGET_GAP_SUMMARY:
				return basicSetTargetGapSummary(null, msgs);
			case OSCALPackage.MAPPING__CONFIDENCE_SCORE:
				return basicSetConfidenceScore(null, msgs);
			case OSCALPackage.MAPPING__COVERAGE:
				return basicSetCoverage(null, msgs);
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
			case OSCALPackage.MAPPING__SOURCE_RESOURCE:
				return getSourceResource();
			case OSCALPackage.MAPPING__TARGET_RESOURCE:
				return getTargetResource();
			case OSCALPackage.MAPPING__MAP:
				return getMap();
			case OSCALPackage.MAPPING__PROP:
				return getProp();
			case OSCALPackage.MAPPING__LINK:
				return getLink();
			case OSCALPackage.MAPPING__REMARKS:
				return getRemarks();
			case OSCALPackage.MAPPING__MAPPING_DESCRIPTION:
				return getMappingDescription();
			case OSCALPackage.MAPPING__SOURCE_GAP_SUMMARY:
				return getSourceGapSummary();
			case OSCALPackage.MAPPING__TARGET_GAP_SUMMARY:
				return getTargetGapSummary();
			case OSCALPackage.MAPPING__CONFIDENCE_SCORE:
				return getConfidenceScore();
			case OSCALPackage.MAPPING__COVERAGE:
				return getCoverage();
			case OSCALPackage.MAPPING__MATCHING_RATIONALE:
				return getMatchingRationale();
			case OSCALPackage.MAPPING__METHOD:
				return getMethod();
			case OSCALPackage.MAPPING__STATUS:
				return getStatus();
			case OSCALPackage.MAPPING__UUID:
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
			case OSCALPackage.MAPPING__SOURCE_RESOURCE:
				setSourceResource((MappingResourceReference)newValue);
				return;
			case OSCALPackage.MAPPING__TARGET_RESOURCE:
				setTargetResource((MappingResourceReference)newValue);
				return;
			case OSCALPackage.MAPPING__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapEntry>)newValue);
				return;
			case OSCALPackage.MAPPING__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.MAPPING__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.MAPPING__REMARKS:
				setRemarks((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.MAPPING__MAPPING_DESCRIPTION:
				setMappingDescription((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.MAPPING__SOURCE_GAP_SUMMARY:
				setSourceGapSummary((GapSummary)newValue);
				return;
			case OSCALPackage.MAPPING__TARGET_GAP_SUMMARY:
				setTargetGapSummary((GapSummary)newValue);
				return;
			case OSCALPackage.MAPPING__CONFIDENCE_SCORE:
				setConfidenceScore((ConfidenceScore)newValue);
				return;
			case OSCALPackage.MAPPING__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case OSCALPackage.MAPPING__MATCHING_RATIONALE:
				setMatchingRationale((String)newValue);
				return;
			case OSCALPackage.MAPPING__METHOD:
				setMethod((String)newValue);
				return;
			case OSCALPackage.MAPPING__STATUS:
				setStatus((String)newValue);
				return;
			case OSCALPackage.MAPPING__UUID:
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
			case OSCALPackage.MAPPING__SOURCE_RESOURCE:
				setSourceResource((MappingResourceReference)null);
				return;
			case OSCALPackage.MAPPING__TARGET_RESOURCE:
				setTargetResource((MappingResourceReference)null);
				return;
			case OSCALPackage.MAPPING__MAP:
				getMap().clear();
				return;
			case OSCALPackage.MAPPING__PROP:
				getProp().clear();
				return;
			case OSCALPackage.MAPPING__LINK:
				getLink().clear();
				return;
			case OSCALPackage.MAPPING__REMARKS:
				setRemarks((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.MAPPING__MAPPING_DESCRIPTION:
				setMappingDescription((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.MAPPING__SOURCE_GAP_SUMMARY:
				setSourceGapSummary((GapSummary)null);
				return;
			case OSCALPackage.MAPPING__TARGET_GAP_SUMMARY:
				setTargetGapSummary((GapSummary)null);
				return;
			case OSCALPackage.MAPPING__CONFIDENCE_SCORE:
				setConfidenceScore((ConfidenceScore)null);
				return;
			case OSCALPackage.MAPPING__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case OSCALPackage.MAPPING__MATCHING_RATIONALE:
				setMatchingRationale(MATCHING_RATIONALE_EDEFAULT);
				return;
			case OSCALPackage.MAPPING__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case OSCALPackage.MAPPING__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case OSCALPackage.MAPPING__UUID:
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
			case OSCALPackage.MAPPING__SOURCE_RESOURCE:
				return sourceResource != null;
			case OSCALPackage.MAPPING__TARGET_RESOURCE:
				return targetResource != null;
			case OSCALPackage.MAPPING__MAP:
				return map != null && !map.isEmpty();
			case OSCALPackage.MAPPING__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.MAPPING__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.MAPPING__REMARKS:
				return remarks != null;
			case OSCALPackage.MAPPING__MAPPING_DESCRIPTION:
				return mappingDescription != null;
			case OSCALPackage.MAPPING__SOURCE_GAP_SUMMARY:
				return sourceGapSummary != null;
			case OSCALPackage.MAPPING__TARGET_GAP_SUMMARY:
				return targetGapSummary != null;
			case OSCALPackage.MAPPING__CONFIDENCE_SCORE:
				return confidenceScore != null;
			case OSCALPackage.MAPPING__COVERAGE:
				return coverage != null;
			case OSCALPackage.MAPPING__MATCHING_RATIONALE:
				return MATCHING_RATIONALE_EDEFAULT == null ? matchingRationale != null : !MATCHING_RATIONALE_EDEFAULT.equals(matchingRationale);
			case OSCALPackage.MAPPING__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case OSCALPackage.MAPPING__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case OSCALPackage.MAPPING__UUID:
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
		result.append(" (matchingRationale: ");
		result.append(matchingRationale);
		result.append(", method: ");
		result.append(method);
		result.append(", status: ");
		result.append(status);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //MappingImpl
