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

import org.dmtf.cim.CIM_AllocationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Allocation Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocationCapabilitiesImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocationCapabilitiesImpl#getOtherResourceType <em>Other Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocationCapabilitiesImpl#getResourceSubType <em>Resource Sub Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocationCapabilitiesImpl#getRequestTypesSupported <em>Request Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocationCapabilitiesImpl#getSharingMode <em>Sharing Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocationCapabilitiesImpl#getSupportedAddStates <em>Supported Add States</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocationCapabilitiesImpl#getSupportedRemoveStates <em>Supported Remove States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AllocationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_AllocationCapabilities {
	/**
	 * The default value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESOURCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected Integer resourceType = RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherResourceType() <em>Other Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_RESOURCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherResourceType() <em>Other Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherResourceType()
	 * @generated
	 * @ordered
	 */
	protected String otherResourceType = OTHER_RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceSubType() <em>Resource Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSubType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_SUB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceSubType() <em>Resource Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSubType()
	 * @generated
	 * @ordered
	 */
	protected String resourceSubType = RESOURCE_SUB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestTypesSupported() <em>Request Types Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestTypesSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REQUEST_TYPES_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestTypesSupported() <em>Request Types Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestTypesSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer requestTypesSupported = REQUEST_TYPES_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharingMode() <em>Sharing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharingMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SHARING_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharingMode() <em>Sharing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharingMode()
	 * @generated
	 * @ordered
	 */
	protected Integer sharingMode = SHARING_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedAddStates() <em>Supported Add States</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAddStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAddStates;

	/**
	 * The cached value of the '{@link #getSupportedRemoveStates() <em>Supported Remove States</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedRemoveStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedRemoveStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AllocationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AllocationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceType(Integer newResourceType) {
		Integer oldResourceType = resourceType;
		resourceType = newResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATION_CAPABILITIES__RESOURCE_TYPE, oldResourceType, resourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherResourceType() {
		return otherResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherResourceType(String newOtherResourceType) {
		String oldOtherResourceType = otherResourceType;
		otherResourceType = newOtherResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATION_CAPABILITIES__OTHER_RESOURCE_TYPE, oldOtherResourceType, otherResourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceSubType() {
		return resourceSubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceSubType(String newResourceSubType) {
		String oldResourceSubType = resourceSubType;
		resourceSubType = newResourceSubType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATION_CAPABILITIES__RESOURCE_SUB_TYPE, oldResourceSubType, resourceSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRequestTypesSupported() {
		return requestTypesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestTypesSupported(Integer newRequestTypesSupported) {
		Integer oldRequestTypesSupported = requestTypesSupported;
		requestTypesSupported = newRequestTypesSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATION_CAPABILITIES__REQUEST_TYPES_SUPPORTED, oldRequestTypesSupported, requestTypesSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSharingMode() {
		return sharingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharingMode(Integer newSharingMode) {
		Integer oldSharingMode = sharingMode;
		sharingMode = newSharingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATION_CAPABILITIES__SHARING_MODE, oldSharingMode, sharingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAddStates() {
		if (supportedAddStates == null) {
			supportedAddStates = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ALLOCATION_CAPABILITIES__SUPPORTED_ADD_STATES);
		}
		return supportedAddStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedRemoveStates() {
		if (supportedRemoveStates == null) {
			supportedRemoveStates = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ALLOCATION_CAPABILITIES__SUPPORTED_REMOVE_STATES);
		}
		return supportedRemoveStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__RESOURCE_TYPE:
				return getResourceType();
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__OTHER_RESOURCE_TYPE:
				return getOtherResourceType();
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__RESOURCE_SUB_TYPE:
				return getResourceSubType();
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__REQUEST_TYPES_SUPPORTED:
				return getRequestTypesSupported();
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__SHARING_MODE:
				return getSharingMode();
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__SUPPORTED_ADD_STATES:
				return getSupportedAddStates();
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__SUPPORTED_REMOVE_STATES:
				return getSupportedRemoveStates();
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
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__RESOURCE_TYPE:
				setResourceType((Integer)newValue);
				return;
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__OTHER_RESOURCE_TYPE:
				setOtherResourceType((String)newValue);
				return;
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__RESOURCE_SUB_TYPE:
				setResourceSubType((String)newValue);
				return;
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__REQUEST_TYPES_SUPPORTED:
				setRequestTypesSupported((Integer)newValue);
				return;
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__SHARING_MODE:
				setSharingMode((Integer)newValue);
				return;
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__SUPPORTED_ADD_STATES:
				getSupportedAddStates().clear();
				getSupportedAddStates().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__SUPPORTED_REMOVE_STATES:
				getSupportedRemoveStates().clear();
				getSupportedRemoveStates().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__OTHER_RESOURCE_TYPE:
				setOtherResourceType(OTHER_RESOURCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__RESOURCE_SUB_TYPE:
				setResourceSubType(RESOURCE_SUB_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__REQUEST_TYPES_SUPPORTED:
				setRequestTypesSupported(REQUEST_TYPES_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__SHARING_MODE:
				setSharingMode(SHARING_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__SUPPORTED_ADD_STATES:
				getSupportedAddStates().clear();
				return;
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__SUPPORTED_REMOVE_STATES:
				getSupportedRemoveStates().clear();
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
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__RESOURCE_TYPE:
				return RESOURCE_TYPE_EDEFAULT == null ? resourceType != null : !RESOURCE_TYPE_EDEFAULT.equals(resourceType);
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__OTHER_RESOURCE_TYPE:
				return OTHER_RESOURCE_TYPE_EDEFAULT == null ? otherResourceType != null : !OTHER_RESOURCE_TYPE_EDEFAULT.equals(otherResourceType);
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__RESOURCE_SUB_TYPE:
				return RESOURCE_SUB_TYPE_EDEFAULT == null ? resourceSubType != null : !RESOURCE_SUB_TYPE_EDEFAULT.equals(resourceSubType);
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__REQUEST_TYPES_SUPPORTED:
				return REQUEST_TYPES_SUPPORTED_EDEFAULT == null ? requestTypesSupported != null : !REQUEST_TYPES_SUPPORTED_EDEFAULT.equals(requestTypesSupported);
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__SHARING_MODE:
				return SHARING_MODE_EDEFAULT == null ? sharingMode != null : !SHARING_MODE_EDEFAULT.equals(sharingMode);
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__SUPPORTED_ADD_STATES:
				return supportedAddStates != null && !supportedAddStates.isEmpty();
			case CimPackage.CIM_ALLOCATION_CAPABILITIES__SUPPORTED_REMOVE_STATES:
				return supportedRemoveStates != null && !supportedRemoveStates.isEmpty();
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
		result.append(" (ResourceType: ");
		result.append(resourceType);
		result.append(", OtherResourceType: ");
		result.append(otherResourceType);
		result.append(", ResourceSubType: ");
		result.append(resourceSubType);
		result.append(", RequestTypesSupported: ");
		result.append(requestTypesSupported);
		result.append(", SharingMode: ");
		result.append(sharingMode);
		result.append(", SupportedAddStates: ");
		result.append(supportedAddStates);
		result.append(", SupportedRemoveStates: ");
		result.append(supportedRemoveStates);
		result.append(')');
		return result.toString();
	}

} //CIM_AllocationCapabilitiesImpl
