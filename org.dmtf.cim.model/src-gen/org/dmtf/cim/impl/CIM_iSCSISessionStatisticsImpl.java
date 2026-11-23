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

import org.dmtf.cim.CIM_iSCSISessionStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM iSCSI Session Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionStatisticsImpl#getCommandPDUsTransferred <em>Command PD Us Transferred</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionStatisticsImpl#getResponsePDUsTransferred <em>Response PD Us Transferred</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionStatisticsImpl#getBytesTransmitted <em>Bytes Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionStatisticsImpl#getBytesReceived <em>Bytes Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionStatisticsImpl#getDigestErrors <em>Digest Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionStatisticsImpl#getConnectionTimeoutErrors <em>Connection Timeout Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_iSCSISessionStatisticsImpl extends CIM_StatisticalDataImpl implements CIM_iSCSISessionStatistics {
	/**
	 * The default value of the '{@link #getCommandPDUsTransferred() <em>Command PD Us Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandPDUsTransferred()
	 * @generated
	 * @ordered
	 */
	protected static final Long COMMAND_PD_US_TRANSFERRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandPDUsTransferred() <em>Command PD Us Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandPDUsTransferred()
	 * @generated
	 * @ordered
	 */
	protected Long commandPDUsTransferred = COMMAND_PD_US_TRANSFERRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponsePDUsTransferred() <em>Response PD Us Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsePDUsTransferred()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESPONSE_PD_US_TRANSFERRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsePDUsTransferred() <em>Response PD Us Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsePDUsTransferred()
	 * @generated
	 * @ordered
	 */
	protected Long responsePDUsTransferred = RESPONSE_PD_US_TRANSFERRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBytesTransmitted() <em>Bytes Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesTransmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTES_TRANSMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytesTransmitted() <em>Bytes Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesTransmitted()
	 * @generated
	 * @ordered
	 */
	protected Long bytesTransmitted = BYTES_TRANSMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBytesReceived() <em>Bytes Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTES_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytesReceived() <em>Bytes Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesReceived()
	 * @generated
	 * @ordered
	 */
	protected Long bytesReceived = BYTES_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDigestErrors() <em>Digest Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigestErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long DIGEST_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDigestErrors() <em>Digest Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigestErrors()
	 * @generated
	 * @ordered
	 */
	protected Long digestErrors = DIGEST_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionTimeoutErrors() <em>Connection Timeout Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeoutErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long CONNECTION_TIMEOUT_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionTimeoutErrors() <em>Connection Timeout Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeoutErrors()
	 * @generated
	 * @ordered
	 */
	protected Long connectionTimeoutErrors = CONNECTION_TIMEOUT_ERRORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_iSCSISessionStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_iSCSISessionStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCommandPDUsTransferred() {
		return commandPDUsTransferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommandPDUsTransferred(Long newCommandPDUsTransferred) {
		Long oldCommandPDUsTransferred = commandPDUsTransferred;
		commandPDUsTransferred = newCommandPDUsTransferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_STATISTICS__COMMAND_PD_US_TRANSFERRED, oldCommandPDUsTransferred, commandPDUsTransferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getResponsePDUsTransferred() {
		return responsePDUsTransferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsePDUsTransferred(Long newResponsePDUsTransferred) {
		Long oldResponsePDUsTransferred = responsePDUsTransferred;
		responsePDUsTransferred = newResponsePDUsTransferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_STATISTICS__RESPONSE_PD_US_TRANSFERRED, oldResponsePDUsTransferred, responsePDUsTransferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBytesTransmitted() {
		return bytesTransmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBytesTransmitted(Long newBytesTransmitted) {
		Long oldBytesTransmitted = bytesTransmitted;
		bytesTransmitted = newBytesTransmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_STATISTICS__BYTES_TRANSMITTED, oldBytesTransmitted, bytesTransmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBytesReceived(Long newBytesReceived) {
		Long oldBytesReceived = bytesReceived;
		bytesReceived = newBytesReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_STATISTICS__BYTES_RECEIVED, oldBytesReceived, bytesReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDigestErrors() {
		return digestErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDigestErrors(Long newDigestErrors) {
		Long oldDigestErrors = digestErrors;
		digestErrors = newDigestErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_STATISTICS__DIGEST_ERRORS, oldDigestErrors, digestErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getConnectionTimeoutErrors() {
		return connectionTimeoutErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionTimeoutErrors(Long newConnectionTimeoutErrors) {
		Long oldConnectionTimeoutErrors = connectionTimeoutErrors;
		connectionTimeoutErrors = newConnectionTimeoutErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_STATISTICS__CONNECTION_TIMEOUT_ERRORS, oldConnectionTimeoutErrors, connectionTimeoutErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__COMMAND_PD_US_TRANSFERRED:
				return getCommandPDUsTransferred();
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__RESPONSE_PD_US_TRANSFERRED:
				return getResponsePDUsTransferred();
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__BYTES_TRANSMITTED:
				return getBytesTransmitted();
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__BYTES_RECEIVED:
				return getBytesReceived();
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__DIGEST_ERRORS:
				return getDigestErrors();
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__CONNECTION_TIMEOUT_ERRORS:
				return getConnectionTimeoutErrors();
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
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__COMMAND_PD_US_TRANSFERRED:
				setCommandPDUsTransferred((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__RESPONSE_PD_US_TRANSFERRED:
				setResponsePDUsTransferred((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__BYTES_TRANSMITTED:
				setBytesTransmitted((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__BYTES_RECEIVED:
				setBytesReceived((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__DIGEST_ERRORS:
				setDigestErrors((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__CONNECTION_TIMEOUT_ERRORS:
				setConnectionTimeoutErrors((Long)newValue);
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
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__COMMAND_PD_US_TRANSFERRED:
				setCommandPDUsTransferred(COMMAND_PD_US_TRANSFERRED_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__RESPONSE_PD_US_TRANSFERRED:
				setResponsePDUsTransferred(RESPONSE_PD_US_TRANSFERRED_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__BYTES_TRANSMITTED:
				setBytesTransmitted(BYTES_TRANSMITTED_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__BYTES_RECEIVED:
				setBytesReceived(BYTES_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__DIGEST_ERRORS:
				setDigestErrors(DIGEST_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__CONNECTION_TIMEOUT_ERRORS:
				setConnectionTimeoutErrors(CONNECTION_TIMEOUT_ERRORS_EDEFAULT);
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
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__COMMAND_PD_US_TRANSFERRED:
				return COMMAND_PD_US_TRANSFERRED_EDEFAULT == null ? commandPDUsTransferred != null : !COMMAND_PD_US_TRANSFERRED_EDEFAULT.equals(commandPDUsTransferred);
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__RESPONSE_PD_US_TRANSFERRED:
				return RESPONSE_PD_US_TRANSFERRED_EDEFAULT == null ? responsePDUsTransferred != null : !RESPONSE_PD_US_TRANSFERRED_EDEFAULT.equals(responsePDUsTransferred);
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__BYTES_TRANSMITTED:
				return BYTES_TRANSMITTED_EDEFAULT == null ? bytesTransmitted != null : !BYTES_TRANSMITTED_EDEFAULT.equals(bytesTransmitted);
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__BYTES_RECEIVED:
				return BYTES_RECEIVED_EDEFAULT == null ? bytesReceived != null : !BYTES_RECEIVED_EDEFAULT.equals(bytesReceived);
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__DIGEST_ERRORS:
				return DIGEST_ERRORS_EDEFAULT == null ? digestErrors != null : !DIGEST_ERRORS_EDEFAULT.equals(digestErrors);
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS__CONNECTION_TIMEOUT_ERRORS:
				return CONNECTION_TIMEOUT_ERRORS_EDEFAULT == null ? connectionTimeoutErrors != null : !CONNECTION_TIMEOUT_ERRORS_EDEFAULT.equals(connectionTimeoutErrors);
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
		result.append(" (CommandPDUsTransferred: ");
		result.append(commandPDUsTransferred);
		result.append(", ResponsePDUsTransferred: ");
		result.append(responsePDUsTransferred);
		result.append(", BytesTransmitted: ");
		result.append(bytesTransmitted);
		result.append(", BytesReceived: ");
		result.append(bytesReceived);
		result.append(", DigestErrors: ");
		result.append(digestErrors);
		result.append(", ConnectionTimeoutErrors: ");
		result.append(connectionTimeoutErrors);
		result.append(')');
		return result.toString();
	}

} //CIM_iSCSISessionStatisticsImpl
