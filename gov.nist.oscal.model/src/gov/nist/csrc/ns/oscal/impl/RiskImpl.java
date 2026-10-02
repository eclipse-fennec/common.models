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

import gov.nist.csrc.ns.oscal.Characterization;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MitigatingFactor;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Origin;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.RelatedObservation;
import gov.nist.csrc.ns.oscal.Response;
import gov.nist.csrc.ns.oscal.Risk;
import gov.nist.csrc.ns.oscal.RiskLog;
import gov.nist.csrc.ns.oscal.ThreatId;

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
 * An implementation of the model object '<em><b>Risk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getThreatId <em>Threat Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getCharacterization <em>Characterization</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getMitigatingFactor <em>Mitigating Factor</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getRiskLog <em>Risk Log</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getRelatedObservation <em>Related Observation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskImpl extends MinimalEObjectImpl.Container implements Risk {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected String statement = STATEMENT_EDEFAULT;

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
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected EList<Origin> origin;

	/**
	 * The cached value of the '{@link #getThreatId() <em>Threat Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatId()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatId> threatId;

	/**
	 * The cached value of the '{@link #getCharacterization() <em>Characterization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterization()
	 * @generated
	 * @ordered
	 */
	protected EList<Characterization> characterization;

	/**
	 * The cached value of the '{@link #getMitigatingFactor() <em>Mitigating Factor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigatingFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<MitigatingFactor> mitigatingFactor;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEADLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar deadline = DEADLINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Response> response;

	/**
	 * The cached value of the '{@link #getRiskLog() <em>Risk Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskLog()
	 * @generated
	 * @ordered
	 */
	protected RiskLog riskLog;

	/**
	 * The cached value of the '{@link #getRelatedObservation() <em>Related Observation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedObservation> relatedObservation;

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
	protected RiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getRisk();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatement(String newStatement) {
		String oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.RISK__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.RISK__LINK);
		}
		return link;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Origin> getOrigin() {
		if (origin == null) {
			origin = new EObjectContainmentEList<Origin>(Origin.class, this, OSCALPackage.RISK__ORIGIN);
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreatId> getThreatId() {
		if (threatId == null) {
			threatId = new EObjectContainmentEList<ThreatId>(ThreatId.class, this, OSCALPackage.RISK__THREAT_ID);
		}
		return threatId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Characterization> getCharacterization() {
		if (characterization == null) {
			characterization = new EObjectContainmentEList<Characterization>(Characterization.class, this, OSCALPackage.RISK__CHARACTERIZATION);
		}
		return characterization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MitigatingFactor> getMitigatingFactor() {
		if (mitigatingFactor == null) {
			mitigatingFactor = new EObjectContainmentEList<MitigatingFactor>(MitigatingFactor.class, this, OSCALPackage.RISK__MITIGATING_FACTOR);
		}
		return mitigatingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeadline(XMLGregorianCalendar newDeadline) {
		XMLGregorianCalendar oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Response> getResponse() {
		if (response == null) {
			response = new EObjectContainmentEList<Response>(Response.class, this, OSCALPackage.RISK__RESPONSE);
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLog getRiskLog() {
		return riskLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRiskLog(RiskLog newRiskLog, NotificationChain msgs) {
		RiskLog oldRiskLog = riskLog;
		riskLog = newRiskLog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK__RISK_LOG, oldRiskLog, newRiskLog);
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
	public void setRiskLog(RiskLog newRiskLog) {
		if (newRiskLog != riskLog) {
			NotificationChain msgs = null;
			if (riskLog != null)
				msgs = ((InternalEObject)riskLog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RISK__RISK_LOG, null, msgs);
			if (newRiskLog != null)
				msgs = ((InternalEObject)newRiskLog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RISK__RISK_LOG, null, msgs);
			msgs = basicSetRiskLog(newRiskLog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK__RISK_LOG, newRiskLog, newRiskLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObservation> getRelatedObservation() {
		if (relatedObservation == null) {
			relatedObservation = new EObjectContainmentEList<RelatedObservation>(RelatedObservation.class, this, OSCALPackage.RISK__RELATED_OBSERVATION);
		}
		return relatedObservation;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.RISK__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RISK__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RISK__ORIGIN:
				return ((InternalEList<?>)getOrigin()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RISK__THREAT_ID:
				return ((InternalEList<?>)getThreatId()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RISK__CHARACTERIZATION:
				return ((InternalEList<?>)getCharacterization()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RISK__MITIGATING_FACTOR:
				return ((InternalEList<?>)getMitigatingFactor()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RISK__RESPONSE:
				return ((InternalEList<?>)getResponse()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RISK__RISK_LOG:
				return basicSetRiskLog(null, msgs);
			case OSCALPackage.RISK__RELATED_OBSERVATION:
				return ((InternalEList<?>)getRelatedObservation()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.RISK__TITLE:
				return getTitle();
			case OSCALPackage.RISK__DESCRIPTION:
				return getDescription();
			case OSCALPackage.RISK__STATEMENT:
				return getStatement();
			case OSCALPackage.RISK__PROP:
				return getProp();
			case OSCALPackage.RISK__LINK:
				return getLink();
			case OSCALPackage.RISK__STATUS:
				return getStatus();
			case OSCALPackage.RISK__ORIGIN:
				return getOrigin();
			case OSCALPackage.RISK__THREAT_ID:
				return getThreatId();
			case OSCALPackage.RISK__CHARACTERIZATION:
				return getCharacterization();
			case OSCALPackage.RISK__MITIGATING_FACTOR:
				return getMitigatingFactor();
			case OSCALPackage.RISK__DEADLINE:
				return getDeadline();
			case OSCALPackage.RISK__RESPONSE:
				return getResponse();
			case OSCALPackage.RISK__RISK_LOG:
				return getRiskLog();
			case OSCALPackage.RISK__RELATED_OBSERVATION:
				return getRelatedObservation();
			case OSCALPackage.RISK__UUID:
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
			case OSCALPackage.RISK__TITLE:
				setTitle((String)newValue);
				return;
			case OSCALPackage.RISK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.RISK__STATEMENT:
				setStatement((String)newValue);
				return;
			case OSCALPackage.RISK__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.RISK__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.RISK__STATUS:
				setStatus((String)newValue);
				return;
			case OSCALPackage.RISK__ORIGIN:
				getOrigin().clear();
				getOrigin().addAll((Collection<? extends Origin>)newValue);
				return;
			case OSCALPackage.RISK__THREAT_ID:
				getThreatId().clear();
				getThreatId().addAll((Collection<? extends ThreatId>)newValue);
				return;
			case OSCALPackage.RISK__CHARACTERIZATION:
				getCharacterization().clear();
				getCharacterization().addAll((Collection<? extends Characterization>)newValue);
				return;
			case OSCALPackage.RISK__MITIGATING_FACTOR:
				getMitigatingFactor().clear();
				getMitigatingFactor().addAll((Collection<? extends MitigatingFactor>)newValue);
				return;
			case OSCALPackage.RISK__DEADLINE:
				setDeadline((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.RISK__RESPONSE:
				getResponse().clear();
				getResponse().addAll((Collection<? extends Response>)newValue);
				return;
			case OSCALPackage.RISK__RISK_LOG:
				setRiskLog((RiskLog)newValue);
				return;
			case OSCALPackage.RISK__RELATED_OBSERVATION:
				getRelatedObservation().clear();
				getRelatedObservation().addAll((Collection<? extends RelatedObservation>)newValue);
				return;
			case OSCALPackage.RISK__UUID:
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
			case OSCALPackage.RISK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OSCALPackage.RISK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.RISK__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case OSCALPackage.RISK__PROP:
				getProp().clear();
				return;
			case OSCALPackage.RISK__LINK:
				getLink().clear();
				return;
			case OSCALPackage.RISK__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case OSCALPackage.RISK__ORIGIN:
				getOrigin().clear();
				return;
			case OSCALPackage.RISK__THREAT_ID:
				getThreatId().clear();
				return;
			case OSCALPackage.RISK__CHARACTERIZATION:
				getCharacterization().clear();
				return;
			case OSCALPackage.RISK__MITIGATING_FACTOR:
				getMitigatingFactor().clear();
				return;
			case OSCALPackage.RISK__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
				return;
			case OSCALPackage.RISK__RESPONSE:
				getResponse().clear();
				return;
			case OSCALPackage.RISK__RISK_LOG:
				setRiskLog((RiskLog)null);
				return;
			case OSCALPackage.RISK__RELATED_OBSERVATION:
				getRelatedObservation().clear();
				return;
			case OSCALPackage.RISK__UUID:
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
			case OSCALPackage.RISK__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OSCALPackage.RISK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.RISK__STATEMENT:
				return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
			case OSCALPackage.RISK__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.RISK__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.RISK__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case OSCALPackage.RISK__ORIGIN:
				return origin != null && !origin.isEmpty();
			case OSCALPackage.RISK__THREAT_ID:
				return threatId != null && !threatId.isEmpty();
			case OSCALPackage.RISK__CHARACTERIZATION:
				return characterization != null && !characterization.isEmpty();
			case OSCALPackage.RISK__MITIGATING_FACTOR:
				return mitigatingFactor != null && !mitigatingFactor.isEmpty();
			case OSCALPackage.RISK__DEADLINE:
				return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
			case OSCALPackage.RISK__RESPONSE:
				return response != null && !response.isEmpty();
			case OSCALPackage.RISK__RISK_LOG:
				return riskLog != null;
			case OSCALPackage.RISK__RELATED_OBSERVATION:
				return relatedObservation != null && !relatedObservation.isEmpty();
			case OSCALPackage.RISK__UUID:
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
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", statement: ");
		result.append(statement);
		result.append(", status: ");
		result.append(status);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //RiskImpl
