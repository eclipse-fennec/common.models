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
package org.dmtf.cim.impl;

import java.util.Collection;

import org.dmtf.cim.CIM_Indication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Indication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationImpl#getIndicationIdentifier <em>Indication Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationImpl#getCorrelatedIndications <em>Correlated Indications</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationImpl#getIndicationTime <em>Indication Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationImpl#getPerceivedSeverity <em>Perceived Severity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationImpl#getOtherSeverity <em>Other Severity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationImpl#getIndicationFilterName <em>Indication Filter Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationImpl#getSequenceContext <em>Sequence Context</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicationImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_IndicationImpl extends MinimalEObjectImpl.Container implements CIM_Indication {
	/**
	 * The default value of the '{@link #getIndicationIdentifier() <em>Indication Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String INDICATION_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndicationIdentifier() <em>Indication Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String indicationIdentifier = INDICATION_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorrelatedIndications() <em>Correlated Indications</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelatedIndications()
	 * @generated
	 * @ordered
	 */
	protected EList<String> correlatedIndications;

	/**
	 * The default value of the '{@link #getIndicationTime() <em>Indication Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationTime()
	 * @generated
	 * @ordered
	 */
	protected static final String INDICATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndicationTime() <em>Indication Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationTime()
	 * @generated
	 * @ordered
	 */
	protected String indicationTime = INDICATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerceivedSeverity() <em>Perceived Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerceivedSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCEIVED_SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerceivedSeverity() <em>Perceived Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerceivedSeverity()
	 * @generated
	 * @ordered
	 */
	protected Integer perceivedSeverity = PERCEIVED_SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSeverity() <em>Other Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSeverity() <em>Other Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSeverity()
	 * @generated
	 * @ordered
	 */
	protected String otherSeverity = OTHER_SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndicationFilterName() <em>Indication Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationFilterName()
	 * @generated
	 * @ordered
	 */
	protected static final String INDICATION_FILTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndicationFilterName() <em>Indication Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationFilterName()
	 * @generated
	 * @ordered
	 */
	protected String indicationFilterName = INDICATION_FILTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceContext() <em>Sequence Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceContext()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceContext() <em>Sequence Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceContext()
	 * @generated
	 * @ordered
	 */
	protected String sequenceContext = SEQUENCE_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long SEQUENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected Long sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IndicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Indication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndicationIdentifier() {
		return indicationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndicationIdentifier(String newIndicationIdentifier) {
		String oldIndicationIdentifier = indicationIdentifier;
		indicationIdentifier = newIndicationIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION__INDICATION_IDENTIFIER, oldIndicationIdentifier, indicationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCorrelatedIndications() {
		if (correlatedIndications == null) {
			correlatedIndications = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_INDICATION__CORRELATED_INDICATIONS);
		}
		return correlatedIndications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndicationTime() {
		return indicationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndicationTime(String newIndicationTime) {
		String oldIndicationTime = indicationTime;
		indicationTime = newIndicationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION__INDICATION_TIME, oldIndicationTime, indicationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPerceivedSeverity() {
		return perceivedSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerceivedSeverity(Integer newPerceivedSeverity) {
		Integer oldPerceivedSeverity = perceivedSeverity;
		perceivedSeverity = newPerceivedSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION__PERCEIVED_SEVERITY, oldPerceivedSeverity, perceivedSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSeverity() {
		return otherSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSeverity(String newOtherSeverity) {
		String oldOtherSeverity = otherSeverity;
		otherSeverity = newOtherSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION__OTHER_SEVERITY, oldOtherSeverity, otherSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndicationFilterName() {
		return indicationFilterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndicationFilterName(String newIndicationFilterName) {
		String oldIndicationFilterName = indicationFilterName;
		indicationFilterName = newIndicationFilterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION__INDICATION_FILTER_NAME, oldIndicationFilterName, indicationFilterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSequenceContext() {
		return sequenceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceContext(String newSequenceContext) {
		String oldSequenceContext = sequenceContext;
		sequenceContext = newSequenceContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION__SEQUENCE_CONTEXT, oldSequenceContext, sequenceContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNumber(Long newSequenceNumber) {
		Long oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATION__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INDICATION__INDICATION_IDENTIFIER:
				return getIndicationIdentifier();
			case CimPackage.CIM_INDICATION__CORRELATED_INDICATIONS:
				return getCorrelatedIndications();
			case CimPackage.CIM_INDICATION__INDICATION_TIME:
				return getIndicationTime();
			case CimPackage.CIM_INDICATION__PERCEIVED_SEVERITY:
				return getPerceivedSeverity();
			case CimPackage.CIM_INDICATION__OTHER_SEVERITY:
				return getOtherSeverity();
			case CimPackage.CIM_INDICATION__INDICATION_FILTER_NAME:
				return getIndicationFilterName();
			case CimPackage.CIM_INDICATION__SEQUENCE_CONTEXT:
				return getSequenceContext();
			case CimPackage.CIM_INDICATION__SEQUENCE_NUMBER:
				return getSequenceNumber();
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
			case CimPackage.CIM_INDICATION__INDICATION_IDENTIFIER:
				setIndicationIdentifier((String)newValue);
				return;
			case CimPackage.CIM_INDICATION__CORRELATED_INDICATIONS:
				getCorrelatedIndications().clear();
				getCorrelatedIndications().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_INDICATION__INDICATION_TIME:
				setIndicationTime((String)newValue);
				return;
			case CimPackage.CIM_INDICATION__PERCEIVED_SEVERITY:
				setPerceivedSeverity((Integer)newValue);
				return;
			case CimPackage.CIM_INDICATION__OTHER_SEVERITY:
				setOtherSeverity((String)newValue);
				return;
			case CimPackage.CIM_INDICATION__INDICATION_FILTER_NAME:
				setIndicationFilterName((String)newValue);
				return;
			case CimPackage.CIM_INDICATION__SEQUENCE_CONTEXT:
				setSequenceContext((String)newValue);
				return;
			case CimPackage.CIM_INDICATION__SEQUENCE_NUMBER:
				setSequenceNumber((Long)newValue);
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
			case CimPackage.CIM_INDICATION__INDICATION_IDENTIFIER:
				setIndicationIdentifier(INDICATION_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION__CORRELATED_INDICATIONS:
				getCorrelatedIndications().clear();
				return;
			case CimPackage.CIM_INDICATION__INDICATION_TIME:
				setIndicationTime(INDICATION_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION__PERCEIVED_SEVERITY:
				setPerceivedSeverity(PERCEIVED_SEVERITY_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION__OTHER_SEVERITY:
				setOtherSeverity(OTHER_SEVERITY_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION__INDICATION_FILTER_NAME:
				setIndicationFilterName(INDICATION_FILTER_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION__SEQUENCE_CONTEXT:
				setSequenceContext(SEQUENCE_CONTEXT_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATION__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
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
			case CimPackage.CIM_INDICATION__INDICATION_IDENTIFIER:
				return INDICATION_IDENTIFIER_EDEFAULT == null ? indicationIdentifier != null : !INDICATION_IDENTIFIER_EDEFAULT.equals(indicationIdentifier);
			case CimPackage.CIM_INDICATION__CORRELATED_INDICATIONS:
				return correlatedIndications != null && !correlatedIndications.isEmpty();
			case CimPackage.CIM_INDICATION__INDICATION_TIME:
				return INDICATION_TIME_EDEFAULT == null ? indicationTime != null : !INDICATION_TIME_EDEFAULT.equals(indicationTime);
			case CimPackage.CIM_INDICATION__PERCEIVED_SEVERITY:
				return PERCEIVED_SEVERITY_EDEFAULT == null ? perceivedSeverity != null : !PERCEIVED_SEVERITY_EDEFAULT.equals(perceivedSeverity);
			case CimPackage.CIM_INDICATION__OTHER_SEVERITY:
				return OTHER_SEVERITY_EDEFAULT == null ? otherSeverity != null : !OTHER_SEVERITY_EDEFAULT.equals(otherSeverity);
			case CimPackage.CIM_INDICATION__INDICATION_FILTER_NAME:
				return INDICATION_FILTER_NAME_EDEFAULT == null ? indicationFilterName != null : !INDICATION_FILTER_NAME_EDEFAULT.equals(indicationFilterName);
			case CimPackage.CIM_INDICATION__SEQUENCE_CONTEXT:
				return SEQUENCE_CONTEXT_EDEFAULT == null ? sequenceContext != null : !SEQUENCE_CONTEXT_EDEFAULT.equals(sequenceContext);
			case CimPackage.CIM_INDICATION__SEQUENCE_NUMBER:
				return SEQUENCE_NUMBER_EDEFAULT == null ? sequenceNumber != null : !SEQUENCE_NUMBER_EDEFAULT.equals(sequenceNumber);
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
		result.append(" (IndicationIdentifier: ");
		result.append(indicationIdentifier);
		result.append(", CorrelatedIndications: ");
		result.append(correlatedIndications);
		result.append(", IndicationTime: ");
		result.append(indicationTime);
		result.append(", PerceivedSeverity: ");
		result.append(perceivedSeverity);
		result.append(", OtherSeverity: ");
		result.append(otherSeverity);
		result.append(", IndicationFilterName: ");
		result.append(indicationFilterName);
		result.append(", SequenceContext: ");
		result.append(sequenceContext);
		result.append(", SequenceNumber: ");
		result.append(sequenceNumber);
		result.append(')');
		return result.toString();
	}

} //CIM_IndicationImpl
