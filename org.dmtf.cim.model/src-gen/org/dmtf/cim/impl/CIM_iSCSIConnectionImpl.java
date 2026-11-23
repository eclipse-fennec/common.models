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

import org.dmtf.cim.CIM_iSCSIConnection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM iSCSI Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionImpl#getConnectionID <em>Connection ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionImpl#getMaxReceiveDataSegmentLength <em>Max Receive Data Segment Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionImpl#getMaxTransmitDataSegmentLength <em>Max Transmit Data Segment Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionImpl#getHeaderDigestMethod <em>Header Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionImpl#getOtherHeaderDigestMethod <em>Other Header Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionImpl#getDataDigestMethod <em>Data Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionImpl#getOtherDataDigestMethod <em>Other Data Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionImpl#getReceivingMarkers <em>Receiving Markers</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionImpl#getSendingMarkers <em>Sending Markers</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionImpl#getActiveiSCSIVersion <em>Activei SCSI Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionImpl#getAuthenticationMethodUsed <em>Authentication Method Used</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionImpl#getMutualAuthentication <em>Mutual Authentication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_iSCSIConnectionImpl extends CIM_NetworkPipeImpl implements CIM_iSCSIConnection {
	/**
	 * The default value of the '{@link #getConnectionID() <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionID()
	 * @generated
	 * @ordered
	 */
	protected static final Long CONNECTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionID() <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionID()
	 * @generated
	 * @ordered
	 */
	protected Long connectionID = CONNECTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxReceiveDataSegmentLength() <em>Max Receive Data Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveDataSegmentLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_RECEIVE_DATA_SEGMENT_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxReceiveDataSegmentLength() <em>Max Receive Data Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveDataSegmentLength()
	 * @generated
	 * @ordered
	 */
	protected Long maxReceiveDataSegmentLength = MAX_RECEIVE_DATA_SEGMENT_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTransmitDataSegmentLength() <em>Max Transmit Data Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTransmitDataSegmentLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_TRANSMIT_DATA_SEGMENT_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTransmitDataSegmentLength() <em>Max Transmit Data Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTransmitDataSegmentLength()
	 * @generated
	 * @ordered
	 */
	protected Long maxTransmitDataSegmentLength = MAX_TRANSMIT_DATA_SEGMENT_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderDigestMethod() <em>Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEADER_DIGEST_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderDigestMethod() <em>Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected Integer headerDigestMethod = HEADER_DIGEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherHeaderDigestMethod() <em>Other Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherHeaderDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_HEADER_DIGEST_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherHeaderDigestMethod() <em>Other Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherHeaderDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected String otherHeaderDigestMethod = OTHER_HEADER_DIGEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataDigestMethod() <em>Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_DIGEST_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataDigestMethod() <em>Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected Integer dataDigestMethod = DATA_DIGEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherDataDigestMethod() <em>Other Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDataDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_DATA_DIGEST_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherDataDigestMethod() <em>Other Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDataDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected String otherDataDigestMethod = OTHER_DATA_DIGEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceivingMarkers() <em>Receiving Markers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingMarkers()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RECEIVING_MARKERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivingMarkers() <em>Receiving Markers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingMarkers()
	 * @generated
	 * @ordered
	 */
	protected Boolean receivingMarkers = RECEIVING_MARKERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendingMarkers() <em>Sending Markers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingMarkers()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SENDING_MARKERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendingMarkers() <em>Sending Markers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingMarkers()
	 * @generated
	 * @ordered
	 */
	protected Boolean sendingMarkers = SENDING_MARKERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveiSCSIVersion() <em>Activei SCSI Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveiSCSIVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ACTIVEI_SCSI_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveiSCSIVersion() <em>Activei SCSI Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveiSCSIVersion()
	 * @generated
	 * @ordered
	 */
	protected Boolean activeiSCSIVersion = ACTIVEI_SCSI_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthenticationMethodUsed() <em>Authentication Method Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMethodUsed()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AUTHENTICATION_METHOD_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthenticationMethodUsed() <em>Authentication Method Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMethodUsed()
	 * @generated
	 * @ordered
	 */
	protected Integer authenticationMethodUsed = AUTHENTICATION_METHOD_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMutualAuthentication() <em>Mutual Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutualAuthentication()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MUTUAL_AUTHENTICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMutualAuthentication() <em>Mutual Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutualAuthentication()
	 * @generated
	 * @ordered
	 */
	protected Boolean mutualAuthentication = MUTUAL_AUTHENTICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_iSCSIConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_iSCSIConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getConnectionID() {
		return connectionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionID(Long newConnectionID) {
		Long oldConnectionID = connectionID;
		connectionID = newConnectionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION__CONNECTION_ID, oldConnectionID, connectionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxReceiveDataSegmentLength() {
		return maxReceiveDataSegmentLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxReceiveDataSegmentLength(Long newMaxReceiveDataSegmentLength) {
		Long oldMaxReceiveDataSegmentLength = maxReceiveDataSegmentLength;
		maxReceiveDataSegmentLength = newMaxReceiveDataSegmentLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION__MAX_RECEIVE_DATA_SEGMENT_LENGTH, oldMaxReceiveDataSegmentLength, maxReceiveDataSegmentLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxTransmitDataSegmentLength() {
		return maxTransmitDataSegmentLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTransmitDataSegmentLength(Long newMaxTransmitDataSegmentLength) {
		Long oldMaxTransmitDataSegmentLength = maxTransmitDataSegmentLength;
		maxTransmitDataSegmentLength = newMaxTransmitDataSegmentLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION__MAX_TRANSMIT_DATA_SEGMENT_LENGTH, oldMaxTransmitDataSegmentLength, maxTransmitDataSegmentLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHeaderDigestMethod() {
		return headerDigestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderDigestMethod(Integer newHeaderDigestMethod) {
		Integer oldHeaderDigestMethod = headerDigestMethod;
		headerDigestMethod = newHeaderDigestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION__HEADER_DIGEST_METHOD, oldHeaderDigestMethod, headerDigestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherHeaderDigestMethod() {
		return otherHeaderDigestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherHeaderDigestMethod(String newOtherHeaderDigestMethod) {
		String oldOtherHeaderDigestMethod = otherHeaderDigestMethod;
		otherHeaderDigestMethod = newOtherHeaderDigestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION__OTHER_HEADER_DIGEST_METHOD, oldOtherHeaderDigestMethod, otherHeaderDigestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataDigestMethod() {
		return dataDigestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataDigestMethod(Integer newDataDigestMethod) {
		Integer oldDataDigestMethod = dataDigestMethod;
		dataDigestMethod = newDataDigestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION__DATA_DIGEST_METHOD, oldDataDigestMethod, dataDigestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherDataDigestMethod() {
		return otherDataDigestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherDataDigestMethod(String newOtherDataDigestMethod) {
		String oldOtherDataDigestMethod = otherDataDigestMethod;
		otherDataDigestMethod = newOtherDataDigestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION__OTHER_DATA_DIGEST_METHOD, oldOtherDataDigestMethod, otherDataDigestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReceivingMarkers() {
		return receivingMarkers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceivingMarkers(Boolean newReceivingMarkers) {
		Boolean oldReceivingMarkers = receivingMarkers;
		receivingMarkers = newReceivingMarkers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION__RECEIVING_MARKERS, oldReceivingMarkers, receivingMarkers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSendingMarkers() {
		return sendingMarkers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendingMarkers(Boolean newSendingMarkers) {
		Boolean oldSendingMarkers = sendingMarkers;
		sendingMarkers = newSendingMarkers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION__SENDING_MARKERS, oldSendingMarkers, sendingMarkers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getActiveiSCSIVersion() {
		return activeiSCSIVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveiSCSIVersion(Boolean newActiveiSCSIVersion) {
		Boolean oldActiveiSCSIVersion = activeiSCSIVersion;
		activeiSCSIVersion = newActiveiSCSIVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION__ACTIVEI_SCSI_VERSION, oldActiveiSCSIVersion, activeiSCSIVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAuthenticationMethodUsed() {
		return authenticationMethodUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationMethodUsed(Integer newAuthenticationMethodUsed) {
		Integer oldAuthenticationMethodUsed = authenticationMethodUsed;
		authenticationMethodUsed = newAuthenticationMethodUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION__AUTHENTICATION_METHOD_USED, oldAuthenticationMethodUsed, authenticationMethodUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMutualAuthentication() {
		return mutualAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutualAuthentication(Boolean newMutualAuthentication) {
		Boolean oldMutualAuthentication = mutualAuthentication;
		mutualAuthentication = newMutualAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION__MUTUAL_AUTHENTICATION, oldMutualAuthentication, mutualAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ISCSI_CONNECTION__CONNECTION_ID:
				return getConnectionID();
			case CimPackage.CIM_ISCSI_CONNECTION__MAX_RECEIVE_DATA_SEGMENT_LENGTH:
				return getMaxReceiveDataSegmentLength();
			case CimPackage.CIM_ISCSI_CONNECTION__MAX_TRANSMIT_DATA_SEGMENT_LENGTH:
				return getMaxTransmitDataSegmentLength();
			case CimPackage.CIM_ISCSI_CONNECTION__HEADER_DIGEST_METHOD:
				return getHeaderDigestMethod();
			case CimPackage.CIM_ISCSI_CONNECTION__OTHER_HEADER_DIGEST_METHOD:
				return getOtherHeaderDigestMethod();
			case CimPackage.CIM_ISCSI_CONNECTION__DATA_DIGEST_METHOD:
				return getDataDigestMethod();
			case CimPackage.CIM_ISCSI_CONNECTION__OTHER_DATA_DIGEST_METHOD:
				return getOtherDataDigestMethod();
			case CimPackage.CIM_ISCSI_CONNECTION__RECEIVING_MARKERS:
				return getReceivingMarkers();
			case CimPackage.CIM_ISCSI_CONNECTION__SENDING_MARKERS:
				return getSendingMarkers();
			case CimPackage.CIM_ISCSI_CONNECTION__ACTIVEI_SCSI_VERSION:
				return getActiveiSCSIVersion();
			case CimPackage.CIM_ISCSI_CONNECTION__AUTHENTICATION_METHOD_USED:
				return getAuthenticationMethodUsed();
			case CimPackage.CIM_ISCSI_CONNECTION__MUTUAL_AUTHENTICATION:
				return getMutualAuthentication();
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
			case CimPackage.CIM_ISCSI_CONNECTION__CONNECTION_ID:
				setConnectionID((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__MAX_RECEIVE_DATA_SEGMENT_LENGTH:
				setMaxReceiveDataSegmentLength((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__MAX_TRANSMIT_DATA_SEGMENT_LENGTH:
				setMaxTransmitDataSegmentLength((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__HEADER_DIGEST_METHOD:
				setHeaderDigestMethod((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__OTHER_HEADER_DIGEST_METHOD:
				setOtherHeaderDigestMethod((String)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__DATA_DIGEST_METHOD:
				setDataDigestMethod((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__OTHER_DATA_DIGEST_METHOD:
				setOtherDataDigestMethod((String)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__RECEIVING_MARKERS:
				setReceivingMarkers((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__SENDING_MARKERS:
				setSendingMarkers((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__ACTIVEI_SCSI_VERSION:
				setActiveiSCSIVersion((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__AUTHENTICATION_METHOD_USED:
				setAuthenticationMethodUsed((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__MUTUAL_AUTHENTICATION:
				setMutualAuthentication((Boolean)newValue);
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
			case CimPackage.CIM_ISCSI_CONNECTION__CONNECTION_ID:
				setConnectionID(CONNECTION_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__MAX_RECEIVE_DATA_SEGMENT_LENGTH:
				setMaxReceiveDataSegmentLength(MAX_RECEIVE_DATA_SEGMENT_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__MAX_TRANSMIT_DATA_SEGMENT_LENGTH:
				setMaxTransmitDataSegmentLength(MAX_TRANSMIT_DATA_SEGMENT_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__HEADER_DIGEST_METHOD:
				setHeaderDigestMethod(HEADER_DIGEST_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__OTHER_HEADER_DIGEST_METHOD:
				setOtherHeaderDigestMethod(OTHER_HEADER_DIGEST_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__DATA_DIGEST_METHOD:
				setDataDigestMethod(DATA_DIGEST_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__OTHER_DATA_DIGEST_METHOD:
				setOtherDataDigestMethod(OTHER_DATA_DIGEST_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__RECEIVING_MARKERS:
				setReceivingMarkers(RECEIVING_MARKERS_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__SENDING_MARKERS:
				setSendingMarkers(SENDING_MARKERS_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__ACTIVEI_SCSI_VERSION:
				setActiveiSCSIVersion(ACTIVEI_SCSI_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__AUTHENTICATION_METHOD_USED:
				setAuthenticationMethodUsed(AUTHENTICATION_METHOD_USED_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION__MUTUAL_AUTHENTICATION:
				setMutualAuthentication(MUTUAL_AUTHENTICATION_EDEFAULT);
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
			case CimPackage.CIM_ISCSI_CONNECTION__CONNECTION_ID:
				return CONNECTION_ID_EDEFAULT == null ? connectionID != null : !CONNECTION_ID_EDEFAULT.equals(connectionID);
			case CimPackage.CIM_ISCSI_CONNECTION__MAX_RECEIVE_DATA_SEGMENT_LENGTH:
				return MAX_RECEIVE_DATA_SEGMENT_LENGTH_EDEFAULT == null ? maxReceiveDataSegmentLength != null : !MAX_RECEIVE_DATA_SEGMENT_LENGTH_EDEFAULT.equals(maxReceiveDataSegmentLength);
			case CimPackage.CIM_ISCSI_CONNECTION__MAX_TRANSMIT_DATA_SEGMENT_LENGTH:
				return MAX_TRANSMIT_DATA_SEGMENT_LENGTH_EDEFAULT == null ? maxTransmitDataSegmentLength != null : !MAX_TRANSMIT_DATA_SEGMENT_LENGTH_EDEFAULT.equals(maxTransmitDataSegmentLength);
			case CimPackage.CIM_ISCSI_CONNECTION__HEADER_DIGEST_METHOD:
				return HEADER_DIGEST_METHOD_EDEFAULT == null ? headerDigestMethod != null : !HEADER_DIGEST_METHOD_EDEFAULT.equals(headerDigestMethod);
			case CimPackage.CIM_ISCSI_CONNECTION__OTHER_HEADER_DIGEST_METHOD:
				return OTHER_HEADER_DIGEST_METHOD_EDEFAULT == null ? otherHeaderDigestMethod != null : !OTHER_HEADER_DIGEST_METHOD_EDEFAULT.equals(otherHeaderDigestMethod);
			case CimPackage.CIM_ISCSI_CONNECTION__DATA_DIGEST_METHOD:
				return DATA_DIGEST_METHOD_EDEFAULT == null ? dataDigestMethod != null : !DATA_DIGEST_METHOD_EDEFAULT.equals(dataDigestMethod);
			case CimPackage.CIM_ISCSI_CONNECTION__OTHER_DATA_DIGEST_METHOD:
				return OTHER_DATA_DIGEST_METHOD_EDEFAULT == null ? otherDataDigestMethod != null : !OTHER_DATA_DIGEST_METHOD_EDEFAULT.equals(otherDataDigestMethod);
			case CimPackage.CIM_ISCSI_CONNECTION__RECEIVING_MARKERS:
				return RECEIVING_MARKERS_EDEFAULT == null ? receivingMarkers != null : !RECEIVING_MARKERS_EDEFAULT.equals(receivingMarkers);
			case CimPackage.CIM_ISCSI_CONNECTION__SENDING_MARKERS:
				return SENDING_MARKERS_EDEFAULT == null ? sendingMarkers != null : !SENDING_MARKERS_EDEFAULT.equals(sendingMarkers);
			case CimPackage.CIM_ISCSI_CONNECTION__ACTIVEI_SCSI_VERSION:
				return ACTIVEI_SCSI_VERSION_EDEFAULT == null ? activeiSCSIVersion != null : !ACTIVEI_SCSI_VERSION_EDEFAULT.equals(activeiSCSIVersion);
			case CimPackage.CIM_ISCSI_CONNECTION__AUTHENTICATION_METHOD_USED:
				return AUTHENTICATION_METHOD_USED_EDEFAULT == null ? authenticationMethodUsed != null : !AUTHENTICATION_METHOD_USED_EDEFAULT.equals(authenticationMethodUsed);
			case CimPackage.CIM_ISCSI_CONNECTION__MUTUAL_AUTHENTICATION:
				return MUTUAL_AUTHENTICATION_EDEFAULT == null ? mutualAuthentication != null : !MUTUAL_AUTHENTICATION_EDEFAULT.equals(mutualAuthentication);
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
		result.append(" (ConnectionID: ");
		result.append(connectionID);
		result.append(", MaxReceiveDataSegmentLength: ");
		result.append(maxReceiveDataSegmentLength);
		result.append(", MaxTransmitDataSegmentLength: ");
		result.append(maxTransmitDataSegmentLength);
		result.append(", HeaderDigestMethod: ");
		result.append(headerDigestMethod);
		result.append(", OtherHeaderDigestMethod: ");
		result.append(otherHeaderDigestMethod);
		result.append(", DataDigestMethod: ");
		result.append(dataDigestMethod);
		result.append(", OtherDataDigestMethod: ");
		result.append(otherDataDigestMethod);
		result.append(", ReceivingMarkers: ");
		result.append(receivingMarkers);
		result.append(", SendingMarkers: ");
		result.append(sendingMarkers);
		result.append(", ActiveiSCSIVersion: ");
		result.append(activeiSCSIVersion);
		result.append(", AuthenticationMethodUsed: ");
		result.append(authenticationMethodUsed);
		result.append(", MutualAuthentication: ");
		result.append(mutualAuthentication);
		result.append(')');
		return result.toString();
	}

} //CIM_iSCSIConnectionImpl
