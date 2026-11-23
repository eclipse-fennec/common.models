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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_ProtocolControllerMaskingCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Protocol Controller Masking Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getValidHardwareIdTypes <em>Valid Hardware Id Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getOtherValidHardwareIDTypes <em>Other Valid Hardware ID Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getPortsPerView <em>Ports Per View</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getClientSelectableDeviceNumbers <em>Client Selectable Device Numbers</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getAttachDeviceSupported <em>Attach Device Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getOneHardwareIDPerView <em>One Hardware ID Per View</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getUniqueUnitNumbersPerPort <em>Unique Unit Numbers Per Port</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getPrivilegeDeniedSupported <em>Privilege Denied Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getProtocolControllerRequiresAuthorizedIdentity <em>Protocol Controller Requires Authorized Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getProtocolControllerSupportsCollections <em>Protocol Controller Supports Collections</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getExposePathsSupported <em>Expose Paths Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getCreateProtocolControllerSupported <em>Create Protocol Controller Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getMaximumMapCount <em>Maximum Map Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getSPCAllowsNoLUs <em>SPC Allows No LUs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getSPCAllowsNoTargets <em>SPC Allows No Targets</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getSPCAllowsNoInitiators <em>SPC Allows No Initiators</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getSPCSupportsDefaultViews <em>SPC Supports Default Views</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getExposePathsWithNameAndHostTypeSupported <em>Expose Paths With Name And Host Type Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerMaskingCapabilitiesImpl#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProtocolControllerMaskingCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_ProtocolControllerMaskingCapabilities {
	/**
	 * The cached value of the '{@link #getValidHardwareIdTypes() <em>Valid Hardware Id Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidHardwareIdTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> validHardwareIdTypes;

	/**
	 * The cached value of the '{@link #getOtherValidHardwareIDTypes() <em>Other Valid Hardware ID Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherValidHardwareIDTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherValidHardwareIDTypes;

	/**
	 * The default value of the '{@link #getPortsPerView() <em>Ports Per View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsPerView()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORTS_PER_VIEW_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getPortsPerView() <em>Ports Per View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsPerView()
	 * @generated
	 * @ordered
	 */
	protected Integer portsPerView = PORTS_PER_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientSelectableDeviceNumbers() <em>Client Selectable Device Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSelectableDeviceNumbers()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CLIENT_SELECTABLE_DEVICE_NUMBERS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getClientSelectableDeviceNumbers() <em>Client Selectable Device Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSelectableDeviceNumbers()
	 * @generated
	 * @ordered
	 */
	protected Boolean clientSelectableDeviceNumbers = CLIENT_SELECTABLE_DEVICE_NUMBERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttachDeviceSupported() <em>Attach Device Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachDeviceSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ATTACH_DEVICE_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachDeviceSupported() <em>Attach Device Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachDeviceSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean attachDeviceSupported = ATTACH_DEVICE_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOneHardwareIDPerView() <em>One Hardware ID Per View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneHardwareIDPerView()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ONE_HARDWARE_ID_PER_VIEW_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getOneHardwareIDPerView() <em>One Hardware ID Per View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneHardwareIDPerView()
	 * @generated
	 * @ordered
	 */
	protected Boolean oneHardwareIDPerView = ONE_HARDWARE_ID_PER_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueUnitNumbersPerPort() <em>Unique Unit Numbers Per Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueUnitNumbersPerPort()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNIQUE_UNIT_NUMBERS_PER_PORT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUniqueUnitNumbersPerPort() <em>Unique Unit Numbers Per Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueUnitNumbersPerPort()
	 * @generated
	 * @ordered
	 */
	protected Boolean uniqueUnitNumbersPerPort = UNIQUE_UNIT_NUMBERS_PER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivilegeDeniedSupported() <em>Privilege Denied Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegeDeniedSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIVILEGE_DENIED_SUPPORTED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getPrivilegeDeniedSupported() <em>Privilege Denied Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegeDeniedSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean privilegeDeniedSupported = PRIVILEGE_DENIED_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolControllerRequiresAuthorizedIdentity() <em>Protocol Controller Requires Authorized Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolControllerRequiresAuthorizedIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PROTOCOL_CONTROLLER_REQUIRES_AUTHORIZED_IDENTITY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getProtocolControllerRequiresAuthorizedIdentity() <em>Protocol Controller Requires Authorized Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolControllerRequiresAuthorizedIdentity()
	 * @generated
	 * @ordered
	 */
	protected Boolean protocolControllerRequiresAuthorizedIdentity = PROTOCOL_CONTROLLER_REQUIRES_AUTHORIZED_IDENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolControllerSupportsCollections() <em>Protocol Controller Supports Collections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolControllerSupportsCollections()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PROTOCOL_CONTROLLER_SUPPORTS_COLLECTIONS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getProtocolControllerSupportsCollections() <em>Protocol Controller Supports Collections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolControllerSupportsCollections()
	 * @generated
	 * @ordered
	 */
	protected Boolean protocolControllerSupportsCollections = PROTOCOL_CONTROLLER_SUPPORTS_COLLECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExposePathsSupported() <em>Expose Paths Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposePathsSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXPOSE_PATHS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExposePathsSupported() <em>Expose Paths Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposePathsSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean exposePathsSupported = EXPOSE_PATHS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreateProtocolControllerSupported() <em>Create Protocol Controller Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateProtocolControllerSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CREATE_PROTOCOL_CONTROLLER_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateProtocolControllerSupported() <em>Create Protocol Controller Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateProtocolControllerSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean createProtocolControllerSupported = CREATE_PROTOCOL_CONTROLLER_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumMapCount() <em>Maximum Map Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMapCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_MAP_COUNT_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getMaximumMapCount() <em>Maximum Map Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMapCount()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumMapCount = MAXIMUM_MAP_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPCAllowsNoLUs() <em>SPC Allows No LUs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCAllowsNoLUs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SPC_ALLOWS_NO_LUS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSPCAllowsNoLUs() <em>SPC Allows No LUs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCAllowsNoLUs()
	 * @generated
	 * @ordered
	 */
	protected Boolean spcAllowsNoLUs = SPC_ALLOWS_NO_LUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPCAllowsNoTargets() <em>SPC Allows No Targets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCAllowsNoTargets()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SPC_ALLOWS_NO_TARGETS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSPCAllowsNoTargets() <em>SPC Allows No Targets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCAllowsNoTargets()
	 * @generated
	 * @ordered
	 */
	protected Boolean spcAllowsNoTargets = SPC_ALLOWS_NO_TARGETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPCAllowsNoInitiators() <em>SPC Allows No Initiators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCAllowsNoInitiators()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SPC_ALLOWS_NO_INITIATORS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSPCAllowsNoInitiators() <em>SPC Allows No Initiators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCAllowsNoInitiators()
	 * @generated
	 * @ordered
	 */
	protected Boolean spcAllowsNoInitiators = SPC_ALLOWS_NO_INITIATORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPCSupportsDefaultViews() <em>SPC Supports Default Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCSupportsDefaultViews()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SPC_SUPPORTS_DEFAULT_VIEWS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSPCSupportsDefaultViews() <em>SPC Supports Default Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPCSupportsDefaultViews()
	 * @generated
	 * @ordered
	 */
	protected Boolean spcSupportsDefaultViews = SPC_SUPPORTS_DEFAULT_VIEWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExposePathsWithNameAndHostTypeSupported() <em>Expose Paths With Name And Host Type Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposePathsWithNameAndHostTypeSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXPOSE_PATHS_WITH_NAME_AND_HOST_TYPE_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExposePathsWithNameAndHostTypeSupported() <em>Expose Paths With Name And Host Type Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposePathsWithNameAndHostTypeSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean exposePathsWithNameAndHostTypeSupported = EXPOSE_PATHS_WITH_NAME_AND_HOST_TYPE_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedAsynchronousActions() <em>Supported Asynchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAsynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAsynchronousActions;

	/**
	 * The cached value of the '{@link #getSupportedSynchronousActions() <em>Supported Synchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSynchronousActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProtocolControllerMaskingCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProtocolControllerMaskingCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getValidHardwareIdTypes() {
		if (validHardwareIdTypes == null) {
			validHardwareIdTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__VALID_HARDWARE_ID_TYPES);
		}
		return validHardwareIdTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherValidHardwareIDTypes() {
		if (otherValidHardwareIDTypes == null) {
			otherValidHardwareIDTypes = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__OTHER_VALID_HARDWARE_ID_TYPES);
		}
		return otherValidHardwareIDTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPortsPerView() {
		return portsPerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortsPerView(Integer newPortsPerView) {
		Integer oldPortsPerView = portsPerView;
		portsPerView = newPortsPerView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PORTS_PER_VIEW, oldPortsPerView, portsPerView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getClientSelectableDeviceNumbers() {
		return clientSelectableDeviceNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientSelectableDeviceNumbers(Boolean newClientSelectableDeviceNumbers) {
		Boolean oldClientSelectableDeviceNumbers = clientSelectableDeviceNumbers;
		clientSelectableDeviceNumbers = newClientSelectableDeviceNumbers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__CLIENT_SELECTABLE_DEVICE_NUMBERS, oldClientSelectableDeviceNumbers, clientSelectableDeviceNumbers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAttachDeviceSupported() {
		return attachDeviceSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachDeviceSupported(Boolean newAttachDeviceSupported) {
		Boolean oldAttachDeviceSupported = attachDeviceSupported;
		attachDeviceSupported = newAttachDeviceSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__ATTACH_DEVICE_SUPPORTED, oldAttachDeviceSupported, attachDeviceSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOneHardwareIDPerView() {
		return oneHardwareIDPerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOneHardwareIDPerView(Boolean newOneHardwareIDPerView) {
		Boolean oldOneHardwareIDPerView = oneHardwareIDPerView;
		oneHardwareIDPerView = newOneHardwareIDPerView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__ONE_HARDWARE_ID_PER_VIEW, oldOneHardwareIDPerView, oneHardwareIDPerView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUniqueUnitNumbersPerPort() {
		return uniqueUnitNumbersPerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniqueUnitNumbersPerPort(Boolean newUniqueUnitNumbersPerPort) {
		Boolean oldUniqueUnitNumbersPerPort = uniqueUnitNumbersPerPort;
		uniqueUnitNumbersPerPort = newUniqueUnitNumbersPerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__UNIQUE_UNIT_NUMBERS_PER_PORT, oldUniqueUnitNumbersPerPort, uniqueUnitNumbersPerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPrivilegeDeniedSupported() {
		return privilegeDeniedSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivilegeDeniedSupported(Boolean newPrivilegeDeniedSupported) {
		Boolean oldPrivilegeDeniedSupported = privilegeDeniedSupported;
		privilegeDeniedSupported = newPrivilegeDeniedSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PRIVILEGE_DENIED_SUPPORTED, oldPrivilegeDeniedSupported, privilegeDeniedSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getProtocolControllerRequiresAuthorizedIdentity() {
		return protocolControllerRequiresAuthorizedIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolControllerRequiresAuthorizedIdentity(Boolean newProtocolControllerRequiresAuthorizedIdentity) {
		Boolean oldProtocolControllerRequiresAuthorizedIdentity = protocolControllerRequiresAuthorizedIdentity;
		protocolControllerRequiresAuthorizedIdentity = newProtocolControllerRequiresAuthorizedIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PROTOCOL_CONTROLLER_REQUIRES_AUTHORIZED_IDENTITY, oldProtocolControllerRequiresAuthorizedIdentity, protocolControllerRequiresAuthorizedIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getProtocolControllerSupportsCollections() {
		return protocolControllerSupportsCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolControllerSupportsCollections(Boolean newProtocolControllerSupportsCollections) {
		Boolean oldProtocolControllerSupportsCollections = protocolControllerSupportsCollections;
		protocolControllerSupportsCollections = newProtocolControllerSupportsCollections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PROTOCOL_CONTROLLER_SUPPORTS_COLLECTIONS, oldProtocolControllerSupportsCollections, protocolControllerSupportsCollections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExposePathsSupported() {
		return exposePathsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExposePathsSupported(Boolean newExposePathsSupported) {
		Boolean oldExposePathsSupported = exposePathsSupported;
		exposePathsSupported = newExposePathsSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__EXPOSE_PATHS_SUPPORTED, oldExposePathsSupported, exposePathsSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCreateProtocolControllerSupported() {
		return createProtocolControllerSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateProtocolControllerSupported(Boolean newCreateProtocolControllerSupported) {
		Boolean oldCreateProtocolControllerSupported = createProtocolControllerSupported;
		createProtocolControllerSupported = newCreateProtocolControllerSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__CREATE_PROTOCOL_CONTROLLER_SUPPORTED, oldCreateProtocolControllerSupported, createProtocolControllerSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumMapCount() {
		return maximumMapCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumMapCount(Integer newMaximumMapCount) {
		Integer oldMaximumMapCount = maximumMapCount;
		maximumMapCount = newMaximumMapCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__MAXIMUM_MAP_COUNT, oldMaximumMapCount, maximumMapCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSPCAllowsNoLUs() {
		return spcAllowsNoLUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPCAllowsNoLUs(Boolean newSPCAllowsNoLUs) {
		Boolean oldSPCAllowsNoLUs = spcAllowsNoLUs;
		spcAllowsNoLUs = newSPCAllowsNoLUs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_LUS, oldSPCAllowsNoLUs, spcAllowsNoLUs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSPCAllowsNoTargets() {
		return spcAllowsNoTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPCAllowsNoTargets(Boolean newSPCAllowsNoTargets) {
		Boolean oldSPCAllowsNoTargets = spcAllowsNoTargets;
		spcAllowsNoTargets = newSPCAllowsNoTargets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_TARGETS, oldSPCAllowsNoTargets, spcAllowsNoTargets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSPCAllowsNoInitiators() {
		return spcAllowsNoInitiators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPCAllowsNoInitiators(Boolean newSPCAllowsNoInitiators) {
		Boolean oldSPCAllowsNoInitiators = spcAllowsNoInitiators;
		spcAllowsNoInitiators = newSPCAllowsNoInitiators;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_INITIATORS, oldSPCAllowsNoInitiators, spcAllowsNoInitiators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSPCSupportsDefaultViews() {
		return spcSupportsDefaultViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPCSupportsDefaultViews(Boolean newSPCSupportsDefaultViews) {
		Boolean oldSPCSupportsDefaultViews = spcSupportsDefaultViews;
		spcSupportsDefaultViews = newSPCSupportsDefaultViews;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_SUPPORTS_DEFAULT_VIEWS, oldSPCSupportsDefaultViews, spcSupportsDefaultViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExposePathsWithNameAndHostTypeSupported() {
		return exposePathsWithNameAndHostTypeSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExposePathsWithNameAndHostTypeSupported(Boolean newExposePathsWithNameAndHostTypeSupported) {
		Boolean oldExposePathsWithNameAndHostTypeSupported = exposePathsWithNameAndHostTypeSupported;
		exposePathsWithNameAndHostTypeSupported = newExposePathsWithNameAndHostTypeSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__EXPOSE_PATHS_WITH_NAME_AND_HOST_TYPE_SUPPORTED, oldExposePathsWithNameAndHostTypeSupported, exposePathsWithNameAndHostTypeSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousActions() {
		if (supportedAsynchronousActions == null) {
			supportedAsynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS);
		}
		return supportedAsynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSynchronousActions() {
		if (supportedSynchronousActions == null) {
			supportedSynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS);
		}
		return supportedSynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetElementNameCapabilities(Integer ElementType, CIM_ManagedElement Goal, EList<Integer> SupportedFeatures, Integer MaxElementNameLen, String ElementNameMask) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__VALID_HARDWARE_ID_TYPES:
				return getValidHardwareIdTypes();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__OTHER_VALID_HARDWARE_ID_TYPES:
				return getOtherValidHardwareIDTypes();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PORTS_PER_VIEW:
				return getPortsPerView();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__CLIENT_SELECTABLE_DEVICE_NUMBERS:
				return getClientSelectableDeviceNumbers();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__ATTACH_DEVICE_SUPPORTED:
				return getAttachDeviceSupported();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__ONE_HARDWARE_ID_PER_VIEW:
				return getOneHardwareIDPerView();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__UNIQUE_UNIT_NUMBERS_PER_PORT:
				return getUniqueUnitNumbersPerPort();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PRIVILEGE_DENIED_SUPPORTED:
				return getPrivilegeDeniedSupported();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PROTOCOL_CONTROLLER_REQUIRES_AUTHORIZED_IDENTITY:
				return getProtocolControllerRequiresAuthorizedIdentity();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PROTOCOL_CONTROLLER_SUPPORTS_COLLECTIONS:
				return getProtocolControllerSupportsCollections();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__EXPOSE_PATHS_SUPPORTED:
				return getExposePathsSupported();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__CREATE_PROTOCOL_CONTROLLER_SUPPORTED:
				return getCreateProtocolControllerSupported();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__MAXIMUM_MAP_COUNT:
				return getMaximumMapCount();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_LUS:
				return getSPCAllowsNoLUs();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_TARGETS:
				return getSPCAllowsNoTargets();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_INITIATORS:
				return getSPCAllowsNoInitiators();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_SUPPORTS_DEFAULT_VIEWS:
				return getSPCSupportsDefaultViews();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__EXPOSE_PATHS_WITH_NAME_AND_HOST_TYPE_SUPPORTED:
				return getExposePathsWithNameAndHostTypeSupported();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return getSupportedAsynchronousActions();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return getSupportedSynchronousActions();
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
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__VALID_HARDWARE_ID_TYPES:
				getValidHardwareIdTypes().clear();
				getValidHardwareIdTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__OTHER_VALID_HARDWARE_ID_TYPES:
				getOtherValidHardwareIDTypes().clear();
				getOtherValidHardwareIDTypes().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PORTS_PER_VIEW:
				setPortsPerView((Integer)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__CLIENT_SELECTABLE_DEVICE_NUMBERS:
				setClientSelectableDeviceNumbers((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__ATTACH_DEVICE_SUPPORTED:
				setAttachDeviceSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__ONE_HARDWARE_ID_PER_VIEW:
				setOneHardwareIDPerView((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__UNIQUE_UNIT_NUMBERS_PER_PORT:
				setUniqueUnitNumbersPerPort((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PRIVILEGE_DENIED_SUPPORTED:
				setPrivilegeDeniedSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PROTOCOL_CONTROLLER_REQUIRES_AUTHORIZED_IDENTITY:
				setProtocolControllerRequiresAuthorizedIdentity((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PROTOCOL_CONTROLLER_SUPPORTS_COLLECTIONS:
				setProtocolControllerSupportsCollections((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__EXPOSE_PATHS_SUPPORTED:
				setExposePathsSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__CREATE_PROTOCOL_CONTROLLER_SUPPORTED:
				setCreateProtocolControllerSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__MAXIMUM_MAP_COUNT:
				setMaximumMapCount((Integer)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_LUS:
				setSPCAllowsNoLUs((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_TARGETS:
				setSPCAllowsNoTargets((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_INITIATORS:
				setSPCAllowsNoInitiators((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_SUPPORTS_DEFAULT_VIEWS:
				setSPCSupportsDefaultViews((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__EXPOSE_PATHS_WITH_NAME_AND_HOST_TYPE_SUPPORTED:
				setExposePathsWithNameAndHostTypeSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				getSupportedAsynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				getSupportedSynchronousActions().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__VALID_HARDWARE_ID_TYPES:
				getValidHardwareIdTypes().clear();
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__OTHER_VALID_HARDWARE_ID_TYPES:
				getOtherValidHardwareIDTypes().clear();
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PORTS_PER_VIEW:
				setPortsPerView(PORTS_PER_VIEW_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__CLIENT_SELECTABLE_DEVICE_NUMBERS:
				setClientSelectableDeviceNumbers(CLIENT_SELECTABLE_DEVICE_NUMBERS_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__ATTACH_DEVICE_SUPPORTED:
				setAttachDeviceSupported(ATTACH_DEVICE_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__ONE_HARDWARE_ID_PER_VIEW:
				setOneHardwareIDPerView(ONE_HARDWARE_ID_PER_VIEW_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__UNIQUE_UNIT_NUMBERS_PER_PORT:
				setUniqueUnitNumbersPerPort(UNIQUE_UNIT_NUMBERS_PER_PORT_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PRIVILEGE_DENIED_SUPPORTED:
				setPrivilegeDeniedSupported(PRIVILEGE_DENIED_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PROTOCOL_CONTROLLER_REQUIRES_AUTHORIZED_IDENTITY:
				setProtocolControllerRequiresAuthorizedIdentity(PROTOCOL_CONTROLLER_REQUIRES_AUTHORIZED_IDENTITY_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PROTOCOL_CONTROLLER_SUPPORTS_COLLECTIONS:
				setProtocolControllerSupportsCollections(PROTOCOL_CONTROLLER_SUPPORTS_COLLECTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__EXPOSE_PATHS_SUPPORTED:
				setExposePathsSupported(EXPOSE_PATHS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__CREATE_PROTOCOL_CONTROLLER_SUPPORTED:
				setCreateProtocolControllerSupported(CREATE_PROTOCOL_CONTROLLER_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__MAXIMUM_MAP_COUNT:
				setMaximumMapCount(MAXIMUM_MAP_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_LUS:
				setSPCAllowsNoLUs(SPC_ALLOWS_NO_LUS_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_TARGETS:
				setSPCAllowsNoTargets(SPC_ALLOWS_NO_TARGETS_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_INITIATORS:
				setSPCAllowsNoInitiators(SPC_ALLOWS_NO_INITIATORS_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_SUPPORTS_DEFAULT_VIEWS:
				setSPCSupportsDefaultViews(SPC_SUPPORTS_DEFAULT_VIEWS_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__EXPOSE_PATHS_WITH_NAME_AND_HOST_TYPE_SUPPORTED:
				setExposePathsWithNameAndHostTypeSupported(EXPOSE_PATHS_WITH_NAME_AND_HOST_TYPE_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				return;
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
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
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__VALID_HARDWARE_ID_TYPES:
				return validHardwareIdTypes != null && !validHardwareIdTypes.isEmpty();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__OTHER_VALID_HARDWARE_ID_TYPES:
				return otherValidHardwareIDTypes != null && !otherValidHardwareIDTypes.isEmpty();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PORTS_PER_VIEW:
				return PORTS_PER_VIEW_EDEFAULT == null ? portsPerView != null : !PORTS_PER_VIEW_EDEFAULT.equals(portsPerView);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__CLIENT_SELECTABLE_DEVICE_NUMBERS:
				return CLIENT_SELECTABLE_DEVICE_NUMBERS_EDEFAULT == null ? clientSelectableDeviceNumbers != null : !CLIENT_SELECTABLE_DEVICE_NUMBERS_EDEFAULT.equals(clientSelectableDeviceNumbers);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__ATTACH_DEVICE_SUPPORTED:
				return ATTACH_DEVICE_SUPPORTED_EDEFAULT == null ? attachDeviceSupported != null : !ATTACH_DEVICE_SUPPORTED_EDEFAULT.equals(attachDeviceSupported);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__ONE_HARDWARE_ID_PER_VIEW:
				return ONE_HARDWARE_ID_PER_VIEW_EDEFAULT == null ? oneHardwareIDPerView != null : !ONE_HARDWARE_ID_PER_VIEW_EDEFAULT.equals(oneHardwareIDPerView);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__UNIQUE_UNIT_NUMBERS_PER_PORT:
				return UNIQUE_UNIT_NUMBERS_PER_PORT_EDEFAULT == null ? uniqueUnitNumbersPerPort != null : !UNIQUE_UNIT_NUMBERS_PER_PORT_EDEFAULT.equals(uniqueUnitNumbersPerPort);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PRIVILEGE_DENIED_SUPPORTED:
				return PRIVILEGE_DENIED_SUPPORTED_EDEFAULT == null ? privilegeDeniedSupported != null : !PRIVILEGE_DENIED_SUPPORTED_EDEFAULT.equals(privilegeDeniedSupported);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PROTOCOL_CONTROLLER_REQUIRES_AUTHORIZED_IDENTITY:
				return PROTOCOL_CONTROLLER_REQUIRES_AUTHORIZED_IDENTITY_EDEFAULT == null ? protocolControllerRequiresAuthorizedIdentity != null : !PROTOCOL_CONTROLLER_REQUIRES_AUTHORIZED_IDENTITY_EDEFAULT.equals(protocolControllerRequiresAuthorizedIdentity);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__PROTOCOL_CONTROLLER_SUPPORTS_COLLECTIONS:
				return PROTOCOL_CONTROLLER_SUPPORTS_COLLECTIONS_EDEFAULT == null ? protocolControllerSupportsCollections != null : !PROTOCOL_CONTROLLER_SUPPORTS_COLLECTIONS_EDEFAULT.equals(protocolControllerSupportsCollections);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__EXPOSE_PATHS_SUPPORTED:
				return EXPOSE_PATHS_SUPPORTED_EDEFAULT == null ? exposePathsSupported != null : !EXPOSE_PATHS_SUPPORTED_EDEFAULT.equals(exposePathsSupported);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__CREATE_PROTOCOL_CONTROLLER_SUPPORTED:
				return CREATE_PROTOCOL_CONTROLLER_SUPPORTED_EDEFAULT == null ? createProtocolControllerSupported != null : !CREATE_PROTOCOL_CONTROLLER_SUPPORTED_EDEFAULT.equals(createProtocolControllerSupported);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__MAXIMUM_MAP_COUNT:
				return MAXIMUM_MAP_COUNT_EDEFAULT == null ? maximumMapCount != null : !MAXIMUM_MAP_COUNT_EDEFAULT.equals(maximumMapCount);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_LUS:
				return SPC_ALLOWS_NO_LUS_EDEFAULT == null ? spcAllowsNoLUs != null : !SPC_ALLOWS_NO_LUS_EDEFAULT.equals(spcAllowsNoLUs);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_TARGETS:
				return SPC_ALLOWS_NO_TARGETS_EDEFAULT == null ? spcAllowsNoTargets != null : !SPC_ALLOWS_NO_TARGETS_EDEFAULT.equals(spcAllowsNoTargets);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_ALLOWS_NO_INITIATORS:
				return SPC_ALLOWS_NO_INITIATORS_EDEFAULT == null ? spcAllowsNoInitiators != null : !SPC_ALLOWS_NO_INITIATORS_EDEFAULT.equals(spcAllowsNoInitiators);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SPC_SUPPORTS_DEFAULT_VIEWS:
				return SPC_SUPPORTS_DEFAULT_VIEWS_EDEFAULT == null ? spcSupportsDefaultViews != null : !SPC_SUPPORTS_DEFAULT_VIEWS_EDEFAULT.equals(spcSupportsDefaultViews);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__EXPOSE_PATHS_WITH_NAME_AND_HOST_TYPE_SUPPORTED:
				return EXPOSE_PATHS_WITH_NAME_AND_HOST_TYPE_SUPPORTED_EDEFAULT == null ? exposePathsWithNameAndHostTypeSupported != null : !EXPOSE_PATHS_WITH_NAME_AND_HOST_TYPE_SUPPORTED_EDEFAULT.equals(exposePathsWithNameAndHostTypeSupported);
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return supportedAsynchronousActions != null && !supportedAsynchronousActions.isEmpty();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return supportedSynchronousActions != null && !supportedSynchronousActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES___GET_ELEMENT_NAME_CAPABILITIES__INTEGER_CIM_MANAGEDELEMENT_ELIST_INTEGER_STRING:
				return GetElementNameCapabilities((Integer)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (EList<Integer>)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (ValidHardwareIdTypes: ");
		result.append(validHardwareIdTypes);
		result.append(", OtherValidHardwareIDTypes: ");
		result.append(otherValidHardwareIDTypes);
		result.append(", PortsPerView: ");
		result.append(portsPerView);
		result.append(", ClientSelectableDeviceNumbers: ");
		result.append(clientSelectableDeviceNumbers);
		result.append(", AttachDeviceSupported: ");
		result.append(attachDeviceSupported);
		result.append(", OneHardwareIDPerView: ");
		result.append(oneHardwareIDPerView);
		result.append(", UniqueUnitNumbersPerPort: ");
		result.append(uniqueUnitNumbersPerPort);
		result.append(", PrivilegeDeniedSupported: ");
		result.append(privilegeDeniedSupported);
		result.append(", ProtocolControllerRequiresAuthorizedIdentity: ");
		result.append(protocolControllerRequiresAuthorizedIdentity);
		result.append(", ProtocolControllerSupportsCollections: ");
		result.append(protocolControllerSupportsCollections);
		result.append(", ExposePathsSupported: ");
		result.append(exposePathsSupported);
		result.append(", CreateProtocolControllerSupported: ");
		result.append(createProtocolControllerSupported);
		result.append(", MaximumMapCount: ");
		result.append(maximumMapCount);
		result.append(", SPCAllowsNoLUs: ");
		result.append(spcAllowsNoLUs);
		result.append(", SPCAllowsNoTargets: ");
		result.append(spcAllowsNoTargets);
		result.append(", SPCAllowsNoInitiators: ");
		result.append(spcAllowsNoInitiators);
		result.append(", SPCSupportsDefaultViews: ");
		result.append(spcSupportsDefaultViews);
		result.append(", ExposePathsWithNameAndHostTypeSupported: ");
		result.append(exposePathsWithNameAndHostTypeSupported);
		result.append(", SupportedAsynchronousActions: ");
		result.append(supportedAsynchronousActions);
		result.append(", SupportedSynchronousActions: ");
		result.append(supportedSynchronousActions);
		result.append(')');
		return result.toString();
	}

} //CIM_ProtocolControllerMaskingCapabilitiesImpl
