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

import org.dmtf.cim.CIM_ExportedFileShareSetting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Exported File Share Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareSettingImpl#getFileSharingProtocol <em>File Sharing Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareSettingImpl#getProtocolVersions <em>Protocol Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareSettingImpl#getInitialEnabledState <em>Initial Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareSettingImpl#getOtherEnabledState <em>Other Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareSettingImpl#getDefaultReadWrite <em>Default Read Write</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareSettingImpl#getDefaultExecute <em>Default Execute</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareSettingImpl#getExecuteSupport <em>Execute Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareSettingImpl#getDefaultUserIdSupported <em>Default User Id Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareSettingImpl#getRootAccess <em>Root Access</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareSettingImpl#getWritePolicy <em>Write Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareSettingImpl#getAccessPoints <em>Access Points</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareSettingImpl#getCASupported <em>CA Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ExportedFileShareSettingImpl extends CIM_SettingDataImpl implements CIM_ExportedFileShareSetting {
	/**
	 * The default value of the '{@link #getFileSharingProtocol() <em>File Sharing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSharingProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FILE_SHARING_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileSharingProtocol() <em>File Sharing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSharingProtocol()
	 * @generated
	 * @ordered
	 */
	protected Integer fileSharingProtocol = FILE_SHARING_PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtocolVersions() <em>Protocol Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> protocolVersions;

	/**
	 * The default value of the '{@link #getInitialEnabledState() <em>Initial Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialEnabledState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INITIAL_ENABLED_STATE_EDEFAULT = Integer.valueOf(8);

	/**
	 * The cached value of the '{@link #getInitialEnabledState() <em>Initial Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialEnabledState()
	 * @generated
	 * @ordered
	 */
	protected Integer initialEnabledState = INITIAL_ENABLED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEnabledState() <em>Other Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledState()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENABLED_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEnabledState() <em>Other Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledState()
	 * @generated
	 * @ordered
	 */
	protected String otherEnabledState = OTHER_ENABLED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultReadWrite() <em>Default Read Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultReadWrite()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_READ_WRITE_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getDefaultReadWrite() <em>Default Read Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultReadWrite()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultReadWrite = DEFAULT_READ_WRITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultExecute() <em>Default Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultExecute()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_EXECUTE_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getDefaultExecute() <em>Default Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultExecute()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultExecute = DEFAULT_EXECUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecuteSupport() <em>Execute Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecuteSupport()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXECUTE_SUPPORT_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getExecuteSupport() <em>Execute Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecuteSupport()
	 * @generated
	 * @ordered
	 */
	protected Integer executeSupport = EXECUTE_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultUserIdSupported() <em>Default User Id Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultUserIdSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_USER_ID_SUPPORTED_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getDefaultUserIdSupported() <em>Default User Id Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultUserIdSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultUserIdSupported = DEFAULT_USER_ID_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootAccess() <em>Root Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ROOT_ACCESS_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getRootAccess() <em>Root Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer rootAccess = ROOT_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWritePolicy() <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WRITE_POLICY_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getWritePolicy() <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer writePolicy = WRITE_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessPoints() <em>Access Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPoints()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_POINTS_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getAccessPoints() <em>Access Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPoints()
	 * @generated
	 * @ordered
	 */
	protected Integer accessPoints = ACCESS_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCASupported() <em>CA Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCASupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CA_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCASupported() <em>CA Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCASupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean caSupported = CA_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ExportedFileShareSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ExportedFileShareSetting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFileSharingProtocol() {
		return fileSharingProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSharingProtocol(Integer newFileSharingProtocol) {
		Integer oldFileSharingProtocol = fileSharingProtocol;
		fileSharingProtocol = newFileSharingProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__FILE_SHARING_PROTOCOL, oldFileSharingProtocol, fileSharingProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProtocolVersions() {
		if (protocolVersions == null) {
			protocolVersions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__PROTOCOL_VERSIONS);
		}
		return protocolVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInitialEnabledState() {
		return initialEnabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialEnabledState(Integer newInitialEnabledState) {
		Integer oldInitialEnabledState = initialEnabledState;
		initialEnabledState = newInitialEnabledState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__INITIAL_ENABLED_STATE, oldInitialEnabledState, initialEnabledState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherEnabledState() {
		return otherEnabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherEnabledState(String newOtherEnabledState) {
		String oldOtherEnabledState = otherEnabledState;
		otherEnabledState = newOtherEnabledState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__OTHER_ENABLED_STATE, oldOtherEnabledState, otherEnabledState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDefaultReadWrite() {
		return defaultReadWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultReadWrite(Integer newDefaultReadWrite) {
		Integer oldDefaultReadWrite = defaultReadWrite;
		defaultReadWrite = newDefaultReadWrite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_READ_WRITE, oldDefaultReadWrite, defaultReadWrite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDefaultExecute() {
		return defaultExecute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultExecute(Integer newDefaultExecute) {
		Integer oldDefaultExecute = defaultExecute;
		defaultExecute = newDefaultExecute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_EXECUTE, oldDefaultExecute, defaultExecute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExecuteSupport() {
		return executeSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecuteSupport(Integer newExecuteSupport) {
		Integer oldExecuteSupport = executeSupport;
		executeSupport = newExecuteSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__EXECUTE_SUPPORT, oldExecuteSupport, executeSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDefaultUserIdSupported() {
		return defaultUserIdSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultUserIdSupported(Integer newDefaultUserIdSupported) {
		Integer oldDefaultUserIdSupported = defaultUserIdSupported;
		defaultUserIdSupported = newDefaultUserIdSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_USER_ID_SUPPORTED, oldDefaultUserIdSupported, defaultUserIdSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRootAccess() {
		return rootAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootAccess(Integer newRootAccess) {
		Integer oldRootAccess = rootAccess;
		rootAccess = newRootAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__ROOT_ACCESS, oldRootAccess, rootAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWritePolicy() {
		return writePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWritePolicy(Integer newWritePolicy) {
		Integer oldWritePolicy = writePolicy;
		writePolicy = newWritePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__WRITE_POLICY, oldWritePolicy, writePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessPoints() {
		return accessPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessPoints(Integer newAccessPoints) {
		Integer oldAccessPoints = accessPoints;
		accessPoints = newAccessPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__ACCESS_POINTS, oldAccessPoints, accessPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCASupported() {
		return caSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCASupported(Boolean newCASupported) {
		Boolean oldCASupported = caSupported;
		caSupported = newCASupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__CA_SUPPORTED, oldCASupported, caSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__FILE_SHARING_PROTOCOL:
				return getFileSharingProtocol();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__PROTOCOL_VERSIONS:
				return getProtocolVersions();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__INITIAL_ENABLED_STATE:
				return getInitialEnabledState();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__OTHER_ENABLED_STATE:
				return getOtherEnabledState();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_READ_WRITE:
				return getDefaultReadWrite();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_EXECUTE:
				return getDefaultExecute();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__EXECUTE_SUPPORT:
				return getExecuteSupport();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_USER_ID_SUPPORTED:
				return getDefaultUserIdSupported();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__ROOT_ACCESS:
				return getRootAccess();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__WRITE_POLICY:
				return getWritePolicy();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__ACCESS_POINTS:
				return getAccessPoints();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__CA_SUPPORTED:
				return getCASupported();
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
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__FILE_SHARING_PROTOCOL:
				setFileSharingProtocol((Integer)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__PROTOCOL_VERSIONS:
				getProtocolVersions().clear();
				getProtocolVersions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__INITIAL_ENABLED_STATE:
				setInitialEnabledState((Integer)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__OTHER_ENABLED_STATE:
				setOtherEnabledState((String)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_READ_WRITE:
				setDefaultReadWrite((Integer)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_EXECUTE:
				setDefaultExecute((Integer)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__EXECUTE_SUPPORT:
				setExecuteSupport((Integer)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_USER_ID_SUPPORTED:
				setDefaultUserIdSupported((Integer)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__ROOT_ACCESS:
				setRootAccess((Integer)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__WRITE_POLICY:
				setWritePolicy((Integer)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__ACCESS_POINTS:
				setAccessPoints((Integer)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__CA_SUPPORTED:
				setCASupported((Boolean)newValue);
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
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__FILE_SHARING_PROTOCOL:
				setFileSharingProtocol(FILE_SHARING_PROTOCOL_EDEFAULT);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__PROTOCOL_VERSIONS:
				getProtocolVersions().clear();
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__INITIAL_ENABLED_STATE:
				setInitialEnabledState(INITIAL_ENABLED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__OTHER_ENABLED_STATE:
				setOtherEnabledState(OTHER_ENABLED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_READ_WRITE:
				setDefaultReadWrite(DEFAULT_READ_WRITE_EDEFAULT);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_EXECUTE:
				setDefaultExecute(DEFAULT_EXECUTE_EDEFAULT);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__EXECUTE_SUPPORT:
				setExecuteSupport(EXECUTE_SUPPORT_EDEFAULT);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_USER_ID_SUPPORTED:
				setDefaultUserIdSupported(DEFAULT_USER_ID_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__ROOT_ACCESS:
				setRootAccess(ROOT_ACCESS_EDEFAULT);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__WRITE_POLICY:
				setWritePolicy(WRITE_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__ACCESS_POINTS:
				setAccessPoints(ACCESS_POINTS_EDEFAULT);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__CA_SUPPORTED:
				setCASupported(CA_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__FILE_SHARING_PROTOCOL:
				return FILE_SHARING_PROTOCOL_EDEFAULT == null ? fileSharingProtocol != null : !FILE_SHARING_PROTOCOL_EDEFAULT.equals(fileSharingProtocol);
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__PROTOCOL_VERSIONS:
				return protocolVersions != null && !protocolVersions.isEmpty();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__INITIAL_ENABLED_STATE:
				return INITIAL_ENABLED_STATE_EDEFAULT == null ? initialEnabledState != null : !INITIAL_ENABLED_STATE_EDEFAULT.equals(initialEnabledState);
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__OTHER_ENABLED_STATE:
				return OTHER_ENABLED_STATE_EDEFAULT == null ? otherEnabledState != null : !OTHER_ENABLED_STATE_EDEFAULT.equals(otherEnabledState);
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_READ_WRITE:
				return DEFAULT_READ_WRITE_EDEFAULT == null ? defaultReadWrite != null : !DEFAULT_READ_WRITE_EDEFAULT.equals(defaultReadWrite);
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_EXECUTE:
				return DEFAULT_EXECUTE_EDEFAULT == null ? defaultExecute != null : !DEFAULT_EXECUTE_EDEFAULT.equals(defaultExecute);
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__EXECUTE_SUPPORT:
				return EXECUTE_SUPPORT_EDEFAULT == null ? executeSupport != null : !EXECUTE_SUPPORT_EDEFAULT.equals(executeSupport);
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__DEFAULT_USER_ID_SUPPORTED:
				return DEFAULT_USER_ID_SUPPORTED_EDEFAULT == null ? defaultUserIdSupported != null : !DEFAULT_USER_ID_SUPPORTED_EDEFAULT.equals(defaultUserIdSupported);
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__ROOT_ACCESS:
				return ROOT_ACCESS_EDEFAULT == null ? rootAccess != null : !ROOT_ACCESS_EDEFAULT.equals(rootAccess);
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__WRITE_POLICY:
				return WRITE_POLICY_EDEFAULT == null ? writePolicy != null : !WRITE_POLICY_EDEFAULT.equals(writePolicy);
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__ACCESS_POINTS:
				return ACCESS_POINTS_EDEFAULT == null ? accessPoints != null : !ACCESS_POINTS_EDEFAULT.equals(accessPoints);
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING__CA_SUPPORTED:
				return CA_SUPPORTED_EDEFAULT == null ? caSupported != null : !CA_SUPPORTED_EDEFAULT.equals(caSupported);
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
		result.append(" (FileSharingProtocol: ");
		result.append(fileSharingProtocol);
		result.append(", ProtocolVersions: ");
		result.append(protocolVersions);
		result.append(", InitialEnabledState: ");
		result.append(initialEnabledState);
		result.append(", OtherEnabledState: ");
		result.append(otherEnabledState);
		result.append(", DefaultReadWrite: ");
		result.append(defaultReadWrite);
		result.append(", DefaultExecute: ");
		result.append(defaultExecute);
		result.append(", ExecuteSupport: ");
		result.append(executeSupport);
		result.append(", DefaultUserIdSupported: ");
		result.append(defaultUserIdSupported);
		result.append(", RootAccess: ");
		result.append(rootAccess);
		result.append(", WritePolicy: ");
		result.append(writePolicy);
		result.append(", AccessPoints: ");
		result.append(accessPoints);
		result.append(", CASupported: ");
		result.append(caSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_ExportedFileShareSettingImpl
