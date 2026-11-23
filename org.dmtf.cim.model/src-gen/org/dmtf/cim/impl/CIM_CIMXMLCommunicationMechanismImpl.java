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

import org.dmtf.cim.CIM_CIMXMLCommunicationMechanism;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM CIMXML Communication Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMXMLCommunicationMechanismImpl#getCIMXMLProtocolVersion <em>CIMXML Protocol Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMXMLCommunicationMechanismImpl#getCIMValidated <em>CIM Validated</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMXMLCommunicationMechanismImpl#getPulledEnumerationClosureOnExceedingServerLimitsSupported <em>Pulled Enumeration Closure On Exceeding Server Limits Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMXMLCommunicationMechanismImpl#getPulledEnumerationContinuationOnErrorSupported <em>Pulled Enumeration Continuation On Error Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMXMLCommunicationMechanismImpl#getPulledEnumerationMaximumOperationTimeout <em>Pulled Enumeration Maximum Operation Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMXMLCommunicationMechanismImpl#getPulledEnumerationMinimumOperationTimeout <em>Pulled Enumeration Minimum Operation Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMXMLCommunicationMechanismImpl#getPulledEnumerationNoOperationTimeoutSupported <em>Pulled Enumeration No Operation Timeout Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CIMXMLCommunicationMechanismImpl extends CIM_ObjectManagerCommunicationMechanismImpl implements CIM_CIMXMLCommunicationMechanism {
	/**
	 * The default value of the '{@link #getCIMXMLProtocolVersion() <em>CIMXML Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIMXMLProtocolVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CIMXML_PROTOCOL_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCIMXMLProtocolVersion() <em>CIMXML Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIMXMLProtocolVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer cimxmlProtocolVersion = CIMXML_PROTOCOL_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCIMValidated() <em>CIM Validated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIMValidated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CIM_VALIDATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCIMValidated() <em>CIM Validated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIMValidated()
	 * @generated
	 * @ordered
	 */
	protected Boolean cimValidated = CIM_VALIDATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPulledEnumerationClosureOnExceedingServerLimitsSupported() <em>Pulled Enumeration Closure On Exceeding Server Limits Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulledEnumerationClosureOnExceedingServerLimitsSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PULLED_ENUMERATION_CLOSURE_ON_EXCEEDING_SERVER_LIMITS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPulledEnumerationClosureOnExceedingServerLimitsSupported() <em>Pulled Enumeration Closure On Exceeding Server Limits Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulledEnumerationClosureOnExceedingServerLimitsSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean pulledEnumerationClosureOnExceedingServerLimitsSupported = PULLED_ENUMERATION_CLOSURE_ON_EXCEEDING_SERVER_LIMITS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPulledEnumerationContinuationOnErrorSupported() <em>Pulled Enumeration Continuation On Error Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulledEnumerationContinuationOnErrorSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PULLED_ENUMERATION_CONTINUATION_ON_ERROR_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPulledEnumerationContinuationOnErrorSupported() <em>Pulled Enumeration Continuation On Error Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulledEnumerationContinuationOnErrorSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean pulledEnumerationContinuationOnErrorSupported = PULLED_ENUMERATION_CONTINUATION_ON_ERROR_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPulledEnumerationMaximumOperationTimeout() <em>Pulled Enumeration Maximum Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulledEnumerationMaximumOperationTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Long PULLED_ENUMERATION_MAXIMUM_OPERATION_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPulledEnumerationMaximumOperationTimeout() <em>Pulled Enumeration Maximum Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulledEnumerationMaximumOperationTimeout()
	 * @generated
	 * @ordered
	 */
	protected Long pulledEnumerationMaximumOperationTimeout = PULLED_ENUMERATION_MAXIMUM_OPERATION_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPulledEnumerationMinimumOperationTimeout() <em>Pulled Enumeration Minimum Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulledEnumerationMinimumOperationTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Long PULLED_ENUMERATION_MINIMUM_OPERATION_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPulledEnumerationMinimumOperationTimeout() <em>Pulled Enumeration Minimum Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulledEnumerationMinimumOperationTimeout()
	 * @generated
	 * @ordered
	 */
	protected Long pulledEnumerationMinimumOperationTimeout = PULLED_ENUMERATION_MINIMUM_OPERATION_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPulledEnumerationNoOperationTimeoutSupported() <em>Pulled Enumeration No Operation Timeout Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulledEnumerationNoOperationTimeoutSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PULLED_ENUMERATION_NO_OPERATION_TIMEOUT_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPulledEnumerationNoOperationTimeoutSupported() <em>Pulled Enumeration No Operation Timeout Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulledEnumerationNoOperationTimeoutSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean pulledEnumerationNoOperationTimeoutSupported = PULLED_ENUMERATION_NO_OPERATION_TIMEOUT_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CIMXMLCommunicationMechanismImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CIMXMLCommunicationMechanism();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCIMXMLProtocolVersion() {
		return cimxmlProtocolVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIMXMLProtocolVersion(Integer newCIMXMLProtocolVersion) {
		Integer oldCIMXMLProtocolVersion = cimxmlProtocolVersion;
		cimxmlProtocolVersion = newCIMXMLProtocolVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__CIMXML_PROTOCOL_VERSION, oldCIMXMLProtocolVersion, cimxmlProtocolVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCIMValidated() {
		return cimValidated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIMValidated(Boolean newCIMValidated) {
		Boolean oldCIMValidated = cimValidated;
		cimValidated = newCIMValidated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__CIM_VALIDATED, oldCIMValidated, cimValidated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPulledEnumerationClosureOnExceedingServerLimitsSupported() {
		return pulledEnumerationClosureOnExceedingServerLimitsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPulledEnumerationClosureOnExceedingServerLimitsSupported(Boolean newPulledEnumerationClosureOnExceedingServerLimitsSupported) {
		Boolean oldPulledEnumerationClosureOnExceedingServerLimitsSupported = pulledEnumerationClosureOnExceedingServerLimitsSupported;
		pulledEnumerationClosureOnExceedingServerLimitsSupported = newPulledEnumerationClosureOnExceedingServerLimitsSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_CLOSURE_ON_EXCEEDING_SERVER_LIMITS_SUPPORTED, oldPulledEnumerationClosureOnExceedingServerLimitsSupported, pulledEnumerationClosureOnExceedingServerLimitsSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPulledEnumerationContinuationOnErrorSupported() {
		return pulledEnumerationContinuationOnErrorSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPulledEnumerationContinuationOnErrorSupported(Boolean newPulledEnumerationContinuationOnErrorSupported) {
		Boolean oldPulledEnumerationContinuationOnErrorSupported = pulledEnumerationContinuationOnErrorSupported;
		pulledEnumerationContinuationOnErrorSupported = newPulledEnumerationContinuationOnErrorSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_CONTINUATION_ON_ERROR_SUPPORTED, oldPulledEnumerationContinuationOnErrorSupported, pulledEnumerationContinuationOnErrorSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPulledEnumerationMaximumOperationTimeout() {
		return pulledEnumerationMaximumOperationTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPulledEnumerationMaximumOperationTimeout(Long newPulledEnumerationMaximumOperationTimeout) {
		Long oldPulledEnumerationMaximumOperationTimeout = pulledEnumerationMaximumOperationTimeout;
		pulledEnumerationMaximumOperationTimeout = newPulledEnumerationMaximumOperationTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_MAXIMUM_OPERATION_TIMEOUT, oldPulledEnumerationMaximumOperationTimeout, pulledEnumerationMaximumOperationTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPulledEnumerationMinimumOperationTimeout() {
		return pulledEnumerationMinimumOperationTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPulledEnumerationMinimumOperationTimeout(Long newPulledEnumerationMinimumOperationTimeout) {
		Long oldPulledEnumerationMinimumOperationTimeout = pulledEnumerationMinimumOperationTimeout;
		pulledEnumerationMinimumOperationTimeout = newPulledEnumerationMinimumOperationTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_MINIMUM_OPERATION_TIMEOUT, oldPulledEnumerationMinimumOperationTimeout, pulledEnumerationMinimumOperationTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPulledEnumerationNoOperationTimeoutSupported() {
		return pulledEnumerationNoOperationTimeoutSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPulledEnumerationNoOperationTimeoutSupported(Boolean newPulledEnumerationNoOperationTimeoutSupported) {
		Boolean oldPulledEnumerationNoOperationTimeoutSupported = pulledEnumerationNoOperationTimeoutSupported;
		pulledEnumerationNoOperationTimeoutSupported = newPulledEnumerationNoOperationTimeoutSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_NO_OPERATION_TIMEOUT_SUPPORTED, oldPulledEnumerationNoOperationTimeoutSupported, pulledEnumerationNoOperationTimeoutSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__CIMXML_PROTOCOL_VERSION:
				return getCIMXMLProtocolVersion();
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__CIM_VALIDATED:
				return getCIMValidated();
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_CLOSURE_ON_EXCEEDING_SERVER_LIMITS_SUPPORTED:
				return getPulledEnumerationClosureOnExceedingServerLimitsSupported();
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_CONTINUATION_ON_ERROR_SUPPORTED:
				return getPulledEnumerationContinuationOnErrorSupported();
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_MAXIMUM_OPERATION_TIMEOUT:
				return getPulledEnumerationMaximumOperationTimeout();
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_MINIMUM_OPERATION_TIMEOUT:
				return getPulledEnumerationMinimumOperationTimeout();
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_NO_OPERATION_TIMEOUT_SUPPORTED:
				return getPulledEnumerationNoOperationTimeoutSupported();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__CIMXML_PROTOCOL_VERSION:
				setCIMXMLProtocolVersion((Integer)newValue);
				return;
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__CIM_VALIDATED:
				setCIMValidated((Boolean)newValue);
				return;
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_CLOSURE_ON_EXCEEDING_SERVER_LIMITS_SUPPORTED:
				setPulledEnumerationClosureOnExceedingServerLimitsSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_CONTINUATION_ON_ERROR_SUPPORTED:
				setPulledEnumerationContinuationOnErrorSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_MAXIMUM_OPERATION_TIMEOUT:
				setPulledEnumerationMaximumOperationTimeout((Long)newValue);
				return;
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_MINIMUM_OPERATION_TIMEOUT:
				setPulledEnumerationMinimumOperationTimeout((Long)newValue);
				return;
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_NO_OPERATION_TIMEOUT_SUPPORTED:
				setPulledEnumerationNoOperationTimeoutSupported((Boolean)newValue);
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
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__CIMXML_PROTOCOL_VERSION:
				setCIMXMLProtocolVersion(CIMXML_PROTOCOL_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__CIM_VALIDATED:
				setCIMValidated(CIM_VALIDATED_EDEFAULT);
				return;
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_CLOSURE_ON_EXCEEDING_SERVER_LIMITS_SUPPORTED:
				setPulledEnumerationClosureOnExceedingServerLimitsSupported(PULLED_ENUMERATION_CLOSURE_ON_EXCEEDING_SERVER_LIMITS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_CONTINUATION_ON_ERROR_SUPPORTED:
				setPulledEnumerationContinuationOnErrorSupported(PULLED_ENUMERATION_CONTINUATION_ON_ERROR_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_MAXIMUM_OPERATION_TIMEOUT:
				setPulledEnumerationMaximumOperationTimeout(PULLED_ENUMERATION_MAXIMUM_OPERATION_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_MINIMUM_OPERATION_TIMEOUT:
				setPulledEnumerationMinimumOperationTimeout(PULLED_ENUMERATION_MINIMUM_OPERATION_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_NO_OPERATION_TIMEOUT_SUPPORTED:
				setPulledEnumerationNoOperationTimeoutSupported(PULLED_ENUMERATION_NO_OPERATION_TIMEOUT_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__CIMXML_PROTOCOL_VERSION:
				return CIMXML_PROTOCOL_VERSION_EDEFAULT == null ? cimxmlProtocolVersion != null : !CIMXML_PROTOCOL_VERSION_EDEFAULT.equals(cimxmlProtocolVersion);
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__CIM_VALIDATED:
				return CIM_VALIDATED_EDEFAULT == null ? cimValidated != null : !CIM_VALIDATED_EDEFAULT.equals(cimValidated);
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_CLOSURE_ON_EXCEEDING_SERVER_LIMITS_SUPPORTED:
				return PULLED_ENUMERATION_CLOSURE_ON_EXCEEDING_SERVER_LIMITS_SUPPORTED_EDEFAULT == null ? pulledEnumerationClosureOnExceedingServerLimitsSupported != null : !PULLED_ENUMERATION_CLOSURE_ON_EXCEEDING_SERVER_LIMITS_SUPPORTED_EDEFAULT.equals(pulledEnumerationClosureOnExceedingServerLimitsSupported);
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_CONTINUATION_ON_ERROR_SUPPORTED:
				return PULLED_ENUMERATION_CONTINUATION_ON_ERROR_SUPPORTED_EDEFAULT == null ? pulledEnumerationContinuationOnErrorSupported != null : !PULLED_ENUMERATION_CONTINUATION_ON_ERROR_SUPPORTED_EDEFAULT.equals(pulledEnumerationContinuationOnErrorSupported);
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_MAXIMUM_OPERATION_TIMEOUT:
				return PULLED_ENUMERATION_MAXIMUM_OPERATION_TIMEOUT_EDEFAULT == null ? pulledEnumerationMaximumOperationTimeout != null : !PULLED_ENUMERATION_MAXIMUM_OPERATION_TIMEOUT_EDEFAULT.equals(pulledEnumerationMaximumOperationTimeout);
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_MINIMUM_OPERATION_TIMEOUT:
				return PULLED_ENUMERATION_MINIMUM_OPERATION_TIMEOUT_EDEFAULT == null ? pulledEnumerationMinimumOperationTimeout != null : !PULLED_ENUMERATION_MINIMUM_OPERATION_TIMEOUT_EDEFAULT.equals(pulledEnumerationMinimumOperationTimeout);
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM__PULLED_ENUMERATION_NO_OPERATION_TIMEOUT_SUPPORTED:
				return PULLED_ENUMERATION_NO_OPERATION_TIMEOUT_SUPPORTED_EDEFAULT == null ? pulledEnumerationNoOperationTimeoutSupported != null : !PULLED_ENUMERATION_NO_OPERATION_TIMEOUT_SUPPORTED_EDEFAULT.equals(pulledEnumerationNoOperationTimeoutSupported);
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
		result.append(" (CIMXMLProtocolVersion: ");
		result.append(cimxmlProtocolVersion);
		result.append(", CIMValidated: ");
		result.append(cimValidated);
		result.append(", PulledEnumerationClosureOnExceedingServerLimitsSupported: ");
		result.append(pulledEnumerationClosureOnExceedingServerLimitsSupported);
		result.append(", PulledEnumerationContinuationOnErrorSupported: ");
		result.append(pulledEnumerationContinuationOnErrorSupported);
		result.append(", PulledEnumerationMaximumOperationTimeout: ");
		result.append(pulledEnumerationMaximumOperationTimeout);
		result.append(", PulledEnumerationMinimumOperationTimeout: ");
		result.append(pulledEnumerationMinimumOperationTimeout);
		result.append(", PulledEnumerationNoOperationTimeoutSupported: ");
		result.append(pulledEnumerationNoOperationTimeoutSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_CIMXMLCommunicationMechanismImpl
