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

import org.dmtf.cim.CIM_StorageServerAsymmetryCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Server Asymmetry Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageServerAsymmetryCapabilitiesImpl#getStorageResourceSymmetryCapability <em>Storage Resource Symmetry Capability</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageServerAsymmetryCapabilitiesImpl#getStorageResourceType <em>Storage Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageServerAsymmetryCapabilitiesImpl#getStorageResourceAffinityAssignable <em>Storage Resource Affinity Assignable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageServerAsymmetryCapabilitiesImpl#getPortGroupFailoverBehavior <em>Port Group Failover Behavior</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageServerAsymmetryCapabilitiesImpl#getTargetPortSymmetryCapability <em>Target Port Symmetry Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageServerAsymmetryCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_StorageServerAsymmetryCapabilities {
	/**
	 * The default value of the '{@link #getStorageResourceSymmetryCapability() <em>Storage Resource Symmetry Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageResourceSymmetryCapability()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STORAGE_RESOURCE_SYMMETRY_CAPABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageResourceSymmetryCapability() <em>Storage Resource Symmetry Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageResourceSymmetryCapability()
	 * @generated
	 * @ordered
	 */
	protected Integer storageResourceSymmetryCapability = STORAGE_RESOURCE_SYMMETRY_CAPABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageResourceType() <em>Storage Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STORAGE_RESOURCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageResourceType() <em>Storage Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageResourceType()
	 * @generated
	 * @ordered
	 */
	protected Integer storageResourceType = STORAGE_RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageResourceAffinityAssignable() <em>Storage Resource Affinity Assignable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageResourceAffinityAssignable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STORAGE_RESOURCE_AFFINITY_ASSIGNABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageResourceAffinityAssignable() <em>Storage Resource Affinity Assignable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageResourceAffinityAssignable()
	 * @generated
	 * @ordered
	 */
	protected Boolean storageResourceAffinityAssignable = STORAGE_RESOURCE_AFFINITY_ASSIGNABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortGroupFailoverBehavior() <em>Port Group Failover Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortGroupFailoverBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_GROUP_FAILOVER_BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortGroupFailoverBehavior() <em>Port Group Failover Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortGroupFailoverBehavior()
	 * @generated
	 * @ordered
	 */
	protected Integer portGroupFailoverBehavior = PORT_GROUP_FAILOVER_BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetPortSymmetryCapability() <em>Target Port Symmetry Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPortSymmetryCapability()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_PORT_SYMMETRY_CAPABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetPortSymmetryCapability() <em>Target Port Symmetry Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPortSymmetryCapability()
	 * @generated
	 * @ordered
	 */
	protected Integer targetPortSymmetryCapability = TARGET_PORT_SYMMETRY_CAPABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageServerAsymmetryCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageServerAsymmetryCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStorageResourceSymmetryCapability() {
		return storageResourceSymmetryCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageResourceSymmetryCapability(Integer newStorageResourceSymmetryCapability) {
		Integer oldStorageResourceSymmetryCapability = storageResourceSymmetryCapability;
		storageResourceSymmetryCapability = newStorageResourceSymmetryCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_SYMMETRY_CAPABILITY, oldStorageResourceSymmetryCapability, storageResourceSymmetryCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStorageResourceType() {
		return storageResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageResourceType(Integer newStorageResourceType) {
		Integer oldStorageResourceType = storageResourceType;
		storageResourceType = newStorageResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_TYPE, oldStorageResourceType, storageResourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getStorageResourceAffinityAssignable() {
		return storageResourceAffinityAssignable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageResourceAffinityAssignable(Boolean newStorageResourceAffinityAssignable) {
		Boolean oldStorageResourceAffinityAssignable = storageResourceAffinityAssignable;
		storageResourceAffinityAssignable = newStorageResourceAffinityAssignable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_AFFINITY_ASSIGNABLE, oldStorageResourceAffinityAssignable, storageResourceAffinityAssignable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPortGroupFailoverBehavior() {
		return portGroupFailoverBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortGroupFailoverBehavior(Integer newPortGroupFailoverBehavior) {
		Integer oldPortGroupFailoverBehavior = portGroupFailoverBehavior;
		portGroupFailoverBehavior = newPortGroupFailoverBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__PORT_GROUP_FAILOVER_BEHAVIOR, oldPortGroupFailoverBehavior, portGroupFailoverBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTargetPortSymmetryCapability() {
		return targetPortSymmetryCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetPortSymmetryCapability(Integer newTargetPortSymmetryCapability) {
		Integer oldTargetPortSymmetryCapability = targetPortSymmetryCapability;
		targetPortSymmetryCapability = newTargetPortSymmetryCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__TARGET_PORT_SYMMETRY_CAPABILITY, oldTargetPortSymmetryCapability, targetPortSymmetryCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_SYMMETRY_CAPABILITY:
				return getStorageResourceSymmetryCapability();
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_TYPE:
				return getStorageResourceType();
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_AFFINITY_ASSIGNABLE:
				return getStorageResourceAffinityAssignable();
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__PORT_GROUP_FAILOVER_BEHAVIOR:
				return getPortGroupFailoverBehavior();
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__TARGET_PORT_SYMMETRY_CAPABILITY:
				return getTargetPortSymmetryCapability();
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
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_SYMMETRY_CAPABILITY:
				setStorageResourceSymmetryCapability((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_TYPE:
				setStorageResourceType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_AFFINITY_ASSIGNABLE:
				setStorageResourceAffinityAssignable((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__PORT_GROUP_FAILOVER_BEHAVIOR:
				setPortGroupFailoverBehavior((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__TARGET_PORT_SYMMETRY_CAPABILITY:
				setTargetPortSymmetryCapability((Integer)newValue);
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
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_SYMMETRY_CAPABILITY:
				setStorageResourceSymmetryCapability(STORAGE_RESOURCE_SYMMETRY_CAPABILITY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_TYPE:
				setStorageResourceType(STORAGE_RESOURCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_AFFINITY_ASSIGNABLE:
				setStorageResourceAffinityAssignable(STORAGE_RESOURCE_AFFINITY_ASSIGNABLE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__PORT_GROUP_FAILOVER_BEHAVIOR:
				setPortGroupFailoverBehavior(PORT_GROUP_FAILOVER_BEHAVIOR_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__TARGET_PORT_SYMMETRY_CAPABILITY:
				setTargetPortSymmetryCapability(TARGET_PORT_SYMMETRY_CAPABILITY_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_SYMMETRY_CAPABILITY:
				return STORAGE_RESOURCE_SYMMETRY_CAPABILITY_EDEFAULT == null ? storageResourceSymmetryCapability != null : !STORAGE_RESOURCE_SYMMETRY_CAPABILITY_EDEFAULT.equals(storageResourceSymmetryCapability);
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_TYPE:
				return STORAGE_RESOURCE_TYPE_EDEFAULT == null ? storageResourceType != null : !STORAGE_RESOURCE_TYPE_EDEFAULT.equals(storageResourceType);
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__STORAGE_RESOURCE_AFFINITY_ASSIGNABLE:
				return STORAGE_RESOURCE_AFFINITY_ASSIGNABLE_EDEFAULT == null ? storageResourceAffinityAssignable != null : !STORAGE_RESOURCE_AFFINITY_ASSIGNABLE_EDEFAULT.equals(storageResourceAffinityAssignable);
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__PORT_GROUP_FAILOVER_BEHAVIOR:
				return PORT_GROUP_FAILOVER_BEHAVIOR_EDEFAULT == null ? portGroupFailoverBehavior != null : !PORT_GROUP_FAILOVER_BEHAVIOR_EDEFAULT.equals(portGroupFailoverBehavior);
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES__TARGET_PORT_SYMMETRY_CAPABILITY:
				return TARGET_PORT_SYMMETRY_CAPABILITY_EDEFAULT == null ? targetPortSymmetryCapability != null : !TARGET_PORT_SYMMETRY_CAPABILITY_EDEFAULT.equals(targetPortSymmetryCapability);
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
		result.append(" (StorageResourceSymmetryCapability: ");
		result.append(storageResourceSymmetryCapability);
		result.append(", StorageResourceType: ");
		result.append(storageResourceType);
		result.append(", StorageResourceAffinityAssignable: ");
		result.append(storageResourceAffinityAssignable);
		result.append(", PortGroupFailoverBehavior: ");
		result.append(portGroupFailoverBehavior);
		result.append(", TargetPortSymmetryCapability: ");
		result.append(targetPortSymmetryCapability);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageServerAsymmetryCapabilitiesImpl
