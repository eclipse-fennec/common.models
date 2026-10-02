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

import gov.nist.csrc.ns.oscal.AssessmentLog;
import gov.nist.csrc.ns.oscal.Attestation;
import gov.nist.csrc.ns.oscal.Finding;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MarkupLineDatatype;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Observation;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.Result;
import gov.nist.csrc.ns.oscal.ResultLocalDefinitions;
import gov.nist.csrc.ns.oscal.ReviewedControls;
import gov.nist.csrc.ns.oscal.Risk;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getStart <em>Start</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getEnd <em>End</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getLocalDefinitions <em>Local Definitions</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getReviewedControls <em>Reviewed Controls</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getAttestation <em>Attestation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getAssessmentLog <em>Assessment Log</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getFinding <em>Finding</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultImpl extends MinimalEObjectImpl.Container implements Result {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected MarkupLineDatatype title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultilineDatatype description;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar end = END_EDEFAULT;

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
	 * The cached value of the '{@link #getLocalDefinitions() <em>Local Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDefinitions()
	 * @generated
	 * @ordered
	 */
	protected ResultLocalDefinitions localDefinitions;

	/**
	 * The cached value of the '{@link #getReviewedControls() <em>Reviewed Controls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewedControls()
	 * @generated
	 * @ordered
	 */
	protected ReviewedControls reviewedControls;

	/**
	 * The cached value of the '{@link #getAttestation() <em>Attestation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttestation()
	 * @generated
	 * @ordered
	 */
	protected EList<Attestation> attestation;

	/**
	 * The cached value of the '{@link #getAssessmentLog() <em>Assessment Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentLog()
	 * @generated
	 * @ordered
	 */
	protected AssessmentLog assessmentLog;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<Observation> observation;

	/**
	 * The cached value of the '{@link #getRisk() <em>Risk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected EList<Risk> risk;

	/**
	 * The cached value of the '{@link #getFinding() <em>Finding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Finding> finding;

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
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupLineDatatype getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(MarkupLineDatatype newTitle, NotificationChain msgs) {
		MarkupLineDatatype oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__TITLE, oldTitle, newTitle);
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
	public void setTitle(MarkupLineDatatype newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultilineDatatype getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(MarkupMultilineDatatype newDescription, NotificationChain msgs) {
		MarkupMultilineDatatype oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(MarkupMultilineDatatype newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(XMLGregorianCalendar newStart) {
		XMLGregorianCalendar oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(XMLGregorianCalendar newEnd) {
		XMLGregorianCalendar oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.RESULT__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.RESULT__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultLocalDefinitions getLocalDefinitions() {
		return localDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalDefinitions(ResultLocalDefinitions newLocalDefinitions, NotificationChain msgs) {
		ResultLocalDefinitions oldLocalDefinitions = localDefinitions;
		localDefinitions = newLocalDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__LOCAL_DEFINITIONS, oldLocalDefinitions, newLocalDefinitions);
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
	public void setLocalDefinitions(ResultLocalDefinitions newLocalDefinitions) {
		if (newLocalDefinitions != localDefinitions) {
			NotificationChain msgs = null;
			if (localDefinitions != null)
				msgs = ((InternalEObject)localDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT__LOCAL_DEFINITIONS, null, msgs);
			if (newLocalDefinitions != null)
				msgs = ((InternalEObject)newLocalDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT__LOCAL_DEFINITIONS, null, msgs);
			msgs = basicSetLocalDefinitions(newLocalDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__LOCAL_DEFINITIONS, newLocalDefinitions, newLocalDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewedControls getReviewedControls() {
		return reviewedControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReviewedControls(ReviewedControls newReviewedControls, NotificationChain msgs) {
		ReviewedControls oldReviewedControls = reviewedControls;
		reviewedControls = newReviewedControls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__REVIEWED_CONTROLS, oldReviewedControls, newReviewedControls);
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
	public void setReviewedControls(ReviewedControls newReviewedControls) {
		if (newReviewedControls != reviewedControls) {
			NotificationChain msgs = null;
			if (reviewedControls != null)
				msgs = ((InternalEObject)reviewedControls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT__REVIEWED_CONTROLS, null, msgs);
			if (newReviewedControls != null)
				msgs = ((InternalEObject)newReviewedControls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT__REVIEWED_CONTROLS, null, msgs);
			msgs = basicSetReviewedControls(newReviewedControls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__REVIEWED_CONTROLS, newReviewedControls, newReviewedControls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attestation> getAttestation() {
		if (attestation == null) {
			attestation = new EObjectContainmentEList<Attestation>(Attestation.class, this, OSCALPackage.RESULT__ATTESTATION);
		}
		return attestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentLog getAssessmentLog() {
		return assessmentLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessmentLog(AssessmentLog newAssessmentLog, NotificationChain msgs) {
		AssessmentLog oldAssessmentLog = assessmentLog;
		assessmentLog = newAssessmentLog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__ASSESSMENT_LOG, oldAssessmentLog, newAssessmentLog);
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
	public void setAssessmentLog(AssessmentLog newAssessmentLog) {
		if (newAssessmentLog != assessmentLog) {
			NotificationChain msgs = null;
			if (assessmentLog != null)
				msgs = ((InternalEObject)assessmentLog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT__ASSESSMENT_LOG, null, msgs);
			if (newAssessmentLog != null)
				msgs = ((InternalEObject)newAssessmentLog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT__ASSESSMENT_LOG, null, msgs);
			msgs = basicSetAssessmentLog(newAssessmentLog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__ASSESSMENT_LOG, newAssessmentLog, newAssessmentLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Observation> getObservation() {
		if (observation == null) {
			observation = new EObjectContainmentEList<Observation>(Observation.class, this, OSCALPackage.RESULT__OBSERVATION);
		}
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Risk> getRisk() {
		if (risk == null) {
			risk = new EObjectContainmentEList<Risk>(Risk.class, this, OSCALPackage.RESULT__RISK);
		}
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Finding> getFinding() {
		if (finding == null) {
			finding = new EObjectContainmentEList<Finding>(Finding.class, this, OSCALPackage.RESULT__FINDING);
		}
		return finding;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__REMARKS, oldRemarks, newRemarks);
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
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__REMARKS, newRemarks, newRemarks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.RESULT__TITLE:
				return basicSetTitle(null, msgs);
			case OSCALPackage.RESULT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case OSCALPackage.RESULT__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESULT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESULT__LOCAL_DEFINITIONS:
				return basicSetLocalDefinitions(null, msgs);
			case OSCALPackage.RESULT__REVIEWED_CONTROLS:
				return basicSetReviewedControls(null, msgs);
			case OSCALPackage.RESULT__ATTESTATION:
				return ((InternalEList<?>)getAttestation()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESULT__ASSESSMENT_LOG:
				return basicSetAssessmentLog(null, msgs);
			case OSCALPackage.RESULT__OBSERVATION:
				return ((InternalEList<?>)getObservation()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESULT__RISK:
				return ((InternalEList<?>)getRisk()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESULT__FINDING:
				return ((InternalEList<?>)getFinding()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESULT__REMARKS:
				return basicSetRemarks(null, msgs);
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
			case OSCALPackage.RESULT__TITLE:
				return getTitle();
			case OSCALPackage.RESULT__DESCRIPTION:
				return getDescription();
			case OSCALPackage.RESULT__START:
				return getStart();
			case OSCALPackage.RESULT__END:
				return getEnd();
			case OSCALPackage.RESULT__PROP:
				return getProp();
			case OSCALPackage.RESULT__LINK:
				return getLink();
			case OSCALPackage.RESULT__LOCAL_DEFINITIONS:
				return getLocalDefinitions();
			case OSCALPackage.RESULT__REVIEWED_CONTROLS:
				return getReviewedControls();
			case OSCALPackage.RESULT__ATTESTATION:
				return getAttestation();
			case OSCALPackage.RESULT__ASSESSMENT_LOG:
				return getAssessmentLog();
			case OSCALPackage.RESULT__OBSERVATION:
				return getObservation();
			case OSCALPackage.RESULT__RISK:
				return getRisk();
			case OSCALPackage.RESULT__FINDING:
				return getFinding();
			case OSCALPackage.RESULT__REMARKS:
				return getRemarks();
			case OSCALPackage.RESULT__UUID:
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
			case OSCALPackage.RESULT__TITLE:
				setTitle((MarkupLineDatatype)newValue);
				return;
			case OSCALPackage.RESULT__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.RESULT__START:
				setStart((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.RESULT__END:
				setEnd((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.RESULT__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.RESULT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.RESULT__LOCAL_DEFINITIONS:
				setLocalDefinitions((ResultLocalDefinitions)newValue);
				return;
			case OSCALPackage.RESULT__REVIEWED_CONTROLS:
				setReviewedControls((ReviewedControls)newValue);
				return;
			case OSCALPackage.RESULT__ATTESTATION:
				getAttestation().clear();
				getAttestation().addAll((Collection<? extends Attestation>)newValue);
				return;
			case OSCALPackage.RESULT__ASSESSMENT_LOG:
				setAssessmentLog((AssessmentLog)newValue);
				return;
			case OSCALPackage.RESULT__OBSERVATION:
				getObservation().clear();
				getObservation().addAll((Collection<? extends Observation>)newValue);
				return;
			case OSCALPackage.RESULT__RISK:
				getRisk().clear();
				getRisk().addAll((Collection<? extends Risk>)newValue);
				return;
			case OSCALPackage.RESULT__FINDING:
				getFinding().clear();
				getFinding().addAll((Collection<? extends Finding>)newValue);
				return;
			case OSCALPackage.RESULT__REMARKS:
				setRemarks((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.RESULT__UUID:
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
			case OSCALPackage.RESULT__TITLE:
				setTitle((MarkupLineDatatype)null);
				return;
			case OSCALPackage.RESULT__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.RESULT__START:
				setStart(START_EDEFAULT);
				return;
			case OSCALPackage.RESULT__END:
				setEnd(END_EDEFAULT);
				return;
			case OSCALPackage.RESULT__PROP:
				getProp().clear();
				return;
			case OSCALPackage.RESULT__LINK:
				getLink().clear();
				return;
			case OSCALPackage.RESULT__LOCAL_DEFINITIONS:
				setLocalDefinitions((ResultLocalDefinitions)null);
				return;
			case OSCALPackage.RESULT__REVIEWED_CONTROLS:
				setReviewedControls((ReviewedControls)null);
				return;
			case OSCALPackage.RESULT__ATTESTATION:
				getAttestation().clear();
				return;
			case OSCALPackage.RESULT__ASSESSMENT_LOG:
				setAssessmentLog((AssessmentLog)null);
				return;
			case OSCALPackage.RESULT__OBSERVATION:
				getObservation().clear();
				return;
			case OSCALPackage.RESULT__RISK:
				getRisk().clear();
				return;
			case OSCALPackage.RESULT__FINDING:
				getFinding().clear();
				return;
			case OSCALPackage.RESULT__REMARKS:
				setRemarks((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.RESULT__UUID:
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
			case OSCALPackage.RESULT__TITLE:
				return title != null;
			case OSCALPackage.RESULT__DESCRIPTION:
				return description != null;
			case OSCALPackage.RESULT__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case OSCALPackage.RESULT__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case OSCALPackage.RESULT__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.RESULT__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.RESULT__LOCAL_DEFINITIONS:
				return localDefinitions != null;
			case OSCALPackage.RESULT__REVIEWED_CONTROLS:
				return reviewedControls != null;
			case OSCALPackage.RESULT__ATTESTATION:
				return attestation != null && !attestation.isEmpty();
			case OSCALPackage.RESULT__ASSESSMENT_LOG:
				return assessmentLog != null;
			case OSCALPackage.RESULT__OBSERVATION:
				return observation != null && !observation.isEmpty();
			case OSCALPackage.RESULT__RISK:
				return risk != null && !risk.isEmpty();
			case OSCALPackage.RESULT__FINDING:
				return finding != null && !finding.isEmpty();
			case OSCALPackage.RESULT__REMARKS:
				return remarks != null;
			case OSCALPackage.RESULT__UUID:
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
		result.append(" (start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //ResultImpl
