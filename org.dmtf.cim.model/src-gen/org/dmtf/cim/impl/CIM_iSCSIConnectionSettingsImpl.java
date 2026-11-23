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

import org.dmtf.cim.CIM_iSCSIConnectionSettings;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM iSCSI Connection Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionSettingsImpl#getMaxReceiveDataSegmentLength <em>Max Receive Data Segment Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionSettingsImpl#getPrimaryHeaderDigestMethod <em>Primary Header Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionSettingsImpl#getOtherPrimaryHeaderDigestMethod <em>Other Primary Header Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionSettingsImpl#getPrimaryDataDigestMethod <em>Primary Data Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionSettingsImpl#getOtherPrimaryDataDigestMethod <em>Other Primary Data Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionSettingsImpl#getSecondaryHeaderDigestMethod <em>Secondary Header Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionSettingsImpl#getOtherSecondaryHeaderDigestMethod <em>Other Secondary Header Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionSettingsImpl#getSecondaryDataDigestMethod <em>Secondary Data Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionSettingsImpl#getOtherSecondaryDataDigestMethod <em>Other Secondary Data Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionSettingsImpl#getRequestingMarkersOnReceive <em>Requesting Markers On Receive</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionSettingsImpl#getPrimaryAuthenticationMethod <em>Primary Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConnectionSettingsImpl#getSecondaryAuthenticationMethod <em>Secondary Authentication Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_iSCSIConnectionSettingsImpl extends CIM_SettingDataImpl implements CIM_iSCSIConnectionSettings {
	/**
	 * The default value of the '{@link #getMaxReceiveDataSegmentLength() <em>Max Receive Data Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveDataSegmentLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_RECEIVE_DATA_SEGMENT_LENGTH_EDEFAULT = Long.valueOf(8192L);

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
	 * The default value of the '{@link #getPrimaryHeaderDigestMethod() <em>Primary Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryHeaderDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIMARY_HEADER_DIGEST_METHOD_EDEFAULT = Integer.valueOf(3);

	/**
	 * The cached value of the '{@link #getPrimaryHeaderDigestMethod() <em>Primary Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryHeaderDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected Integer primaryHeaderDigestMethod = PRIMARY_HEADER_DIGEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPrimaryHeaderDigestMethod() <em>Other Primary Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPrimaryHeaderDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PRIMARY_HEADER_DIGEST_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPrimaryHeaderDigestMethod() <em>Other Primary Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPrimaryHeaderDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected String otherPrimaryHeaderDigestMethod = OTHER_PRIMARY_HEADER_DIGEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryDataDigestMethod() <em>Primary Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDataDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIMARY_DATA_DIGEST_METHOD_EDEFAULT = Integer.valueOf(3);

	/**
	 * The cached value of the '{@link #getPrimaryDataDigestMethod() <em>Primary Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDataDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected Integer primaryDataDigestMethod = PRIMARY_DATA_DIGEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPrimaryDataDigestMethod() <em>Other Primary Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPrimaryDataDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PRIMARY_DATA_DIGEST_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPrimaryDataDigestMethod() <em>Other Primary Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPrimaryDataDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected String otherPrimaryDataDigestMethod = OTHER_PRIMARY_DATA_DIGEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondaryHeaderDigestMethod() <em>Secondary Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryHeaderDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECONDARY_HEADER_DIGEST_METHOD_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getSecondaryHeaderDigestMethod() <em>Secondary Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryHeaderDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected Integer secondaryHeaderDigestMethod = SECONDARY_HEADER_DIGEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSecondaryHeaderDigestMethod() <em>Other Secondary Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSecondaryHeaderDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SECONDARY_HEADER_DIGEST_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSecondaryHeaderDigestMethod() <em>Other Secondary Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSecondaryHeaderDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected String otherSecondaryHeaderDigestMethod = OTHER_SECONDARY_HEADER_DIGEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondaryDataDigestMethod() <em>Secondary Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryDataDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECONDARY_DATA_DIGEST_METHOD_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getSecondaryDataDigestMethod() <em>Secondary Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryDataDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected Integer secondaryDataDigestMethod = SECONDARY_DATA_DIGEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSecondaryDataDigestMethod() <em>Other Secondary Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSecondaryDataDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SECONDARY_DATA_DIGEST_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSecondaryDataDigestMethod() <em>Other Secondary Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSecondaryDataDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected String otherSecondaryDataDigestMethod = OTHER_SECONDARY_DATA_DIGEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestingMarkersOnReceive() <em>Requesting Markers On Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestingMarkersOnReceive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUESTING_MARKERS_ON_RECEIVE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getRequestingMarkersOnReceive() <em>Requesting Markers On Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestingMarkersOnReceive()
	 * @generated
	 * @ordered
	 */
	protected Boolean requestingMarkersOnReceive = REQUESTING_MARKERS_ON_RECEIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryAuthenticationMethod() <em>Primary Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIMARY_AUTHENTICATION_METHOD_EDEFAULT = Integer.valueOf(5);

	/**
	 * The cached value of the '{@link #getPrimaryAuthenticationMethod() <em>Primary Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected Integer primaryAuthenticationMethod = PRIMARY_AUTHENTICATION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondaryAuthenticationMethod() <em>Secondary Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECONDARY_AUTHENTICATION_METHOD_EDEFAULT = Integer.valueOf(3);

	/**
	 * The cached value of the '{@link #getSecondaryAuthenticationMethod() <em>Secondary Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected Integer secondaryAuthenticationMethod = SECONDARY_AUTHENTICATION_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_iSCSIConnectionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_iSCSIConnectionSettings();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__MAX_RECEIVE_DATA_SEGMENT_LENGTH, oldMaxReceiveDataSegmentLength, maxReceiveDataSegmentLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrimaryHeaderDigestMethod() {
		return primaryHeaderDigestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryHeaderDigestMethod(Integer newPrimaryHeaderDigestMethod) {
		Integer oldPrimaryHeaderDigestMethod = primaryHeaderDigestMethod;
		primaryHeaderDigestMethod = newPrimaryHeaderDigestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_HEADER_DIGEST_METHOD, oldPrimaryHeaderDigestMethod, primaryHeaderDigestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPrimaryHeaderDigestMethod() {
		return otherPrimaryHeaderDigestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPrimaryHeaderDigestMethod(String newOtherPrimaryHeaderDigestMethod) {
		String oldOtherPrimaryHeaderDigestMethod = otherPrimaryHeaderDigestMethod;
		otherPrimaryHeaderDigestMethod = newOtherPrimaryHeaderDigestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_PRIMARY_HEADER_DIGEST_METHOD, oldOtherPrimaryHeaderDigestMethod, otherPrimaryHeaderDigestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrimaryDataDigestMethod() {
		return primaryDataDigestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryDataDigestMethod(Integer newPrimaryDataDigestMethod) {
		Integer oldPrimaryDataDigestMethod = primaryDataDigestMethod;
		primaryDataDigestMethod = newPrimaryDataDigestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_DATA_DIGEST_METHOD, oldPrimaryDataDigestMethod, primaryDataDigestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPrimaryDataDigestMethod() {
		return otherPrimaryDataDigestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPrimaryDataDigestMethod(String newOtherPrimaryDataDigestMethod) {
		String oldOtherPrimaryDataDigestMethod = otherPrimaryDataDigestMethod;
		otherPrimaryDataDigestMethod = newOtherPrimaryDataDigestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_PRIMARY_DATA_DIGEST_METHOD, oldOtherPrimaryDataDigestMethod, otherPrimaryDataDigestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSecondaryHeaderDigestMethod() {
		return secondaryHeaderDigestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondaryHeaderDigestMethod(Integer newSecondaryHeaderDigestMethod) {
		Integer oldSecondaryHeaderDigestMethod = secondaryHeaderDigestMethod;
		secondaryHeaderDigestMethod = newSecondaryHeaderDigestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_HEADER_DIGEST_METHOD, oldSecondaryHeaderDigestMethod, secondaryHeaderDigestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSecondaryHeaderDigestMethod() {
		return otherSecondaryHeaderDigestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSecondaryHeaderDigestMethod(String newOtherSecondaryHeaderDigestMethod) {
		String oldOtherSecondaryHeaderDigestMethod = otherSecondaryHeaderDigestMethod;
		otherSecondaryHeaderDigestMethod = newOtherSecondaryHeaderDigestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_SECONDARY_HEADER_DIGEST_METHOD, oldOtherSecondaryHeaderDigestMethod, otherSecondaryHeaderDigestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSecondaryDataDigestMethod() {
		return secondaryDataDigestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondaryDataDigestMethod(Integer newSecondaryDataDigestMethod) {
		Integer oldSecondaryDataDigestMethod = secondaryDataDigestMethod;
		secondaryDataDigestMethod = newSecondaryDataDigestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_DATA_DIGEST_METHOD, oldSecondaryDataDigestMethod, secondaryDataDigestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSecondaryDataDigestMethod() {
		return otherSecondaryDataDigestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSecondaryDataDigestMethod(String newOtherSecondaryDataDigestMethod) {
		String oldOtherSecondaryDataDigestMethod = otherSecondaryDataDigestMethod;
		otherSecondaryDataDigestMethod = newOtherSecondaryDataDigestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_SECONDARY_DATA_DIGEST_METHOD, oldOtherSecondaryDataDigestMethod, otherSecondaryDataDigestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequestingMarkersOnReceive() {
		return requestingMarkersOnReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestingMarkersOnReceive(Boolean newRequestingMarkersOnReceive) {
		Boolean oldRequestingMarkersOnReceive = requestingMarkersOnReceive;
		requestingMarkersOnReceive = newRequestingMarkersOnReceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__REQUESTING_MARKERS_ON_RECEIVE, oldRequestingMarkersOnReceive, requestingMarkersOnReceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrimaryAuthenticationMethod() {
		return primaryAuthenticationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryAuthenticationMethod(Integer newPrimaryAuthenticationMethod) {
		Integer oldPrimaryAuthenticationMethod = primaryAuthenticationMethod;
		primaryAuthenticationMethod = newPrimaryAuthenticationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_AUTHENTICATION_METHOD, oldPrimaryAuthenticationMethod, primaryAuthenticationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSecondaryAuthenticationMethod() {
		return secondaryAuthenticationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondaryAuthenticationMethod(Integer newSecondaryAuthenticationMethod) {
		Integer oldSecondaryAuthenticationMethod = secondaryAuthenticationMethod;
		secondaryAuthenticationMethod = newSecondaryAuthenticationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_AUTHENTICATION_METHOD, oldSecondaryAuthenticationMethod, secondaryAuthenticationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__MAX_RECEIVE_DATA_SEGMENT_LENGTH:
				return getMaxReceiveDataSegmentLength();
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_HEADER_DIGEST_METHOD:
				return getPrimaryHeaderDigestMethod();
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_PRIMARY_HEADER_DIGEST_METHOD:
				return getOtherPrimaryHeaderDigestMethod();
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_DATA_DIGEST_METHOD:
				return getPrimaryDataDigestMethod();
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_PRIMARY_DATA_DIGEST_METHOD:
				return getOtherPrimaryDataDigestMethod();
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_HEADER_DIGEST_METHOD:
				return getSecondaryHeaderDigestMethod();
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_SECONDARY_HEADER_DIGEST_METHOD:
				return getOtherSecondaryHeaderDigestMethod();
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_DATA_DIGEST_METHOD:
				return getSecondaryDataDigestMethod();
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_SECONDARY_DATA_DIGEST_METHOD:
				return getOtherSecondaryDataDigestMethod();
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__REQUESTING_MARKERS_ON_RECEIVE:
				return getRequestingMarkersOnReceive();
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_AUTHENTICATION_METHOD:
				return getPrimaryAuthenticationMethod();
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_AUTHENTICATION_METHOD:
				return getSecondaryAuthenticationMethod();
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
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__MAX_RECEIVE_DATA_SEGMENT_LENGTH:
				setMaxReceiveDataSegmentLength((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_HEADER_DIGEST_METHOD:
				setPrimaryHeaderDigestMethod((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_PRIMARY_HEADER_DIGEST_METHOD:
				setOtherPrimaryHeaderDigestMethod((String)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_DATA_DIGEST_METHOD:
				setPrimaryDataDigestMethod((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_PRIMARY_DATA_DIGEST_METHOD:
				setOtherPrimaryDataDigestMethod((String)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_HEADER_DIGEST_METHOD:
				setSecondaryHeaderDigestMethod((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_SECONDARY_HEADER_DIGEST_METHOD:
				setOtherSecondaryHeaderDigestMethod((String)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_DATA_DIGEST_METHOD:
				setSecondaryDataDigestMethod((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_SECONDARY_DATA_DIGEST_METHOD:
				setOtherSecondaryDataDigestMethod((String)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__REQUESTING_MARKERS_ON_RECEIVE:
				setRequestingMarkersOnReceive((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_AUTHENTICATION_METHOD:
				setPrimaryAuthenticationMethod((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_AUTHENTICATION_METHOD:
				setSecondaryAuthenticationMethod((Integer)newValue);
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
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__MAX_RECEIVE_DATA_SEGMENT_LENGTH:
				setMaxReceiveDataSegmentLength(MAX_RECEIVE_DATA_SEGMENT_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_HEADER_DIGEST_METHOD:
				setPrimaryHeaderDigestMethod(PRIMARY_HEADER_DIGEST_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_PRIMARY_HEADER_DIGEST_METHOD:
				setOtherPrimaryHeaderDigestMethod(OTHER_PRIMARY_HEADER_DIGEST_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_DATA_DIGEST_METHOD:
				setPrimaryDataDigestMethod(PRIMARY_DATA_DIGEST_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_PRIMARY_DATA_DIGEST_METHOD:
				setOtherPrimaryDataDigestMethod(OTHER_PRIMARY_DATA_DIGEST_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_HEADER_DIGEST_METHOD:
				setSecondaryHeaderDigestMethod(SECONDARY_HEADER_DIGEST_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_SECONDARY_HEADER_DIGEST_METHOD:
				setOtherSecondaryHeaderDigestMethod(OTHER_SECONDARY_HEADER_DIGEST_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_DATA_DIGEST_METHOD:
				setSecondaryDataDigestMethod(SECONDARY_DATA_DIGEST_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_SECONDARY_DATA_DIGEST_METHOD:
				setOtherSecondaryDataDigestMethod(OTHER_SECONDARY_DATA_DIGEST_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__REQUESTING_MARKERS_ON_RECEIVE:
				setRequestingMarkersOnReceive(REQUESTING_MARKERS_ON_RECEIVE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_AUTHENTICATION_METHOD:
				setPrimaryAuthenticationMethod(PRIMARY_AUTHENTICATION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_AUTHENTICATION_METHOD:
				setSecondaryAuthenticationMethod(SECONDARY_AUTHENTICATION_METHOD_EDEFAULT);
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
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__MAX_RECEIVE_DATA_SEGMENT_LENGTH:
				return MAX_RECEIVE_DATA_SEGMENT_LENGTH_EDEFAULT == null ? maxReceiveDataSegmentLength != null : !MAX_RECEIVE_DATA_SEGMENT_LENGTH_EDEFAULT.equals(maxReceiveDataSegmentLength);
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_HEADER_DIGEST_METHOD:
				return PRIMARY_HEADER_DIGEST_METHOD_EDEFAULT == null ? primaryHeaderDigestMethod != null : !PRIMARY_HEADER_DIGEST_METHOD_EDEFAULT.equals(primaryHeaderDigestMethod);
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_PRIMARY_HEADER_DIGEST_METHOD:
				return OTHER_PRIMARY_HEADER_DIGEST_METHOD_EDEFAULT == null ? otherPrimaryHeaderDigestMethod != null : !OTHER_PRIMARY_HEADER_DIGEST_METHOD_EDEFAULT.equals(otherPrimaryHeaderDigestMethod);
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_DATA_DIGEST_METHOD:
				return PRIMARY_DATA_DIGEST_METHOD_EDEFAULT == null ? primaryDataDigestMethod != null : !PRIMARY_DATA_DIGEST_METHOD_EDEFAULT.equals(primaryDataDigestMethod);
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_PRIMARY_DATA_DIGEST_METHOD:
				return OTHER_PRIMARY_DATA_DIGEST_METHOD_EDEFAULT == null ? otherPrimaryDataDigestMethod != null : !OTHER_PRIMARY_DATA_DIGEST_METHOD_EDEFAULT.equals(otherPrimaryDataDigestMethod);
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_HEADER_DIGEST_METHOD:
				return SECONDARY_HEADER_DIGEST_METHOD_EDEFAULT == null ? secondaryHeaderDigestMethod != null : !SECONDARY_HEADER_DIGEST_METHOD_EDEFAULT.equals(secondaryHeaderDigestMethod);
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_SECONDARY_HEADER_DIGEST_METHOD:
				return OTHER_SECONDARY_HEADER_DIGEST_METHOD_EDEFAULT == null ? otherSecondaryHeaderDigestMethod != null : !OTHER_SECONDARY_HEADER_DIGEST_METHOD_EDEFAULT.equals(otherSecondaryHeaderDigestMethod);
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_DATA_DIGEST_METHOD:
				return SECONDARY_DATA_DIGEST_METHOD_EDEFAULT == null ? secondaryDataDigestMethod != null : !SECONDARY_DATA_DIGEST_METHOD_EDEFAULT.equals(secondaryDataDigestMethod);
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__OTHER_SECONDARY_DATA_DIGEST_METHOD:
				return OTHER_SECONDARY_DATA_DIGEST_METHOD_EDEFAULT == null ? otherSecondaryDataDigestMethod != null : !OTHER_SECONDARY_DATA_DIGEST_METHOD_EDEFAULT.equals(otherSecondaryDataDigestMethod);
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__REQUESTING_MARKERS_ON_RECEIVE:
				return REQUESTING_MARKERS_ON_RECEIVE_EDEFAULT == null ? requestingMarkersOnReceive != null : !REQUESTING_MARKERS_ON_RECEIVE_EDEFAULT.equals(requestingMarkersOnReceive);
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__PRIMARY_AUTHENTICATION_METHOD:
				return PRIMARY_AUTHENTICATION_METHOD_EDEFAULT == null ? primaryAuthenticationMethod != null : !PRIMARY_AUTHENTICATION_METHOD_EDEFAULT.equals(primaryAuthenticationMethod);
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS__SECONDARY_AUTHENTICATION_METHOD:
				return SECONDARY_AUTHENTICATION_METHOD_EDEFAULT == null ? secondaryAuthenticationMethod != null : !SECONDARY_AUTHENTICATION_METHOD_EDEFAULT.equals(secondaryAuthenticationMethod);
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
		result.append(" (MaxReceiveDataSegmentLength: ");
		result.append(maxReceiveDataSegmentLength);
		result.append(", PrimaryHeaderDigestMethod: ");
		result.append(primaryHeaderDigestMethod);
		result.append(", OtherPrimaryHeaderDigestMethod: ");
		result.append(otherPrimaryHeaderDigestMethod);
		result.append(", PrimaryDataDigestMethod: ");
		result.append(primaryDataDigestMethod);
		result.append(", OtherPrimaryDataDigestMethod: ");
		result.append(otherPrimaryDataDigestMethod);
		result.append(", SecondaryHeaderDigestMethod: ");
		result.append(secondaryHeaderDigestMethod);
		result.append(", OtherSecondaryHeaderDigestMethod: ");
		result.append(otherSecondaryHeaderDigestMethod);
		result.append(", SecondaryDataDigestMethod: ");
		result.append(secondaryDataDigestMethod);
		result.append(", OtherSecondaryDataDigestMethod: ");
		result.append(otherSecondaryDataDigestMethod);
		result.append(", RequestingMarkersOnReceive: ");
		result.append(requestingMarkersOnReceive);
		result.append(", PrimaryAuthenticationMethod: ");
		result.append(primaryAuthenticationMethod);
		result.append(", SecondaryAuthenticationMethod: ");
		result.append(secondaryAuthenticationMethod);
		result.append(')');
		return result.toString();
	}

} //CIM_iSCSIConnectionSettingsImpl
