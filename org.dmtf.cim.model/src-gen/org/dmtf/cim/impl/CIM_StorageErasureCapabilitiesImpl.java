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

import org.dmtf.cim.CIM_StorageErasureCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Erasure Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageErasureCapabilitiesImpl#getErasureMethods <em>Erasure Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageErasureCapabilitiesImpl#getDefaultErasureMethod <em>Default Erasure Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageErasureCapabilitiesImpl#getCanEraseOnReturnToStoragePool <em>Can Erase On Return To Storage Pool</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageErasureCapabilitiesImpl#getElementTypesSupported <em>Element Types Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageErasureCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_StorageErasureCapabilities {
	/**
	 * The cached value of the '{@link #getErasureMethods() <em>Erasure Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErasureMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<String> erasureMethods;

	/**
	 * The default value of the '{@link #getDefaultErasureMethod() <em>Default Erasure Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultErasureMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ERASURE_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultErasureMethod() <em>Default Erasure Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultErasureMethod()
	 * @generated
	 * @ordered
	 */
	protected String defaultErasureMethod = DEFAULT_ERASURE_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanEraseOnReturnToStoragePool() <em>Can Erase On Return To Storage Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanEraseOnReturnToStoragePool()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_ERASE_ON_RETURN_TO_STORAGE_POOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanEraseOnReturnToStoragePool() <em>Can Erase On Return To Storage Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanEraseOnReturnToStoragePool()
	 * @generated
	 * @ordered
	 */
	protected Boolean canEraseOnReturnToStoragePool = CAN_ERASE_ON_RETURN_TO_STORAGE_POOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementTypesSupported() <em>Element Types Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementTypesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> elementTypesSupported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageErasureCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageErasureCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getErasureMethods() {
		if (erasureMethods == null) {
			erasureMethods = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__ERASURE_METHODS);
		}
		return erasureMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultErasureMethod() {
		return defaultErasureMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultErasureMethod(String newDefaultErasureMethod) {
		String oldDefaultErasureMethod = defaultErasureMethod;
		defaultErasureMethod = newDefaultErasureMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__DEFAULT_ERASURE_METHOD, oldDefaultErasureMethod, defaultErasureMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanEraseOnReturnToStoragePool() {
		return canEraseOnReturnToStoragePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanEraseOnReturnToStoragePool(Boolean newCanEraseOnReturnToStoragePool) {
		Boolean oldCanEraseOnReturnToStoragePool = canEraseOnReturnToStoragePool;
		canEraseOnReturnToStoragePool = newCanEraseOnReturnToStoragePool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__CAN_ERASE_ON_RETURN_TO_STORAGE_POOL, oldCanEraseOnReturnToStoragePool, canEraseOnReturnToStoragePool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getElementTypesSupported() {
		if (elementTypesSupported == null) {
			elementTypesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__ELEMENT_TYPES_SUPPORTED);
		}
		return elementTypesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__ERASURE_METHODS:
				return getErasureMethods();
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__DEFAULT_ERASURE_METHOD:
				return getDefaultErasureMethod();
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__CAN_ERASE_ON_RETURN_TO_STORAGE_POOL:
				return getCanEraseOnReturnToStoragePool();
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__ELEMENT_TYPES_SUPPORTED:
				return getElementTypesSupported();
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
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__ERASURE_METHODS:
				getErasureMethods().clear();
				getErasureMethods().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__DEFAULT_ERASURE_METHOD:
				setDefaultErasureMethod((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__CAN_ERASE_ON_RETURN_TO_STORAGE_POOL:
				setCanEraseOnReturnToStoragePool((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__ELEMENT_TYPES_SUPPORTED:
				getElementTypesSupported().clear();
				getElementTypesSupported().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__ERASURE_METHODS:
				getErasureMethods().clear();
				return;
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__DEFAULT_ERASURE_METHOD:
				setDefaultErasureMethod(DEFAULT_ERASURE_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__CAN_ERASE_ON_RETURN_TO_STORAGE_POOL:
				setCanEraseOnReturnToStoragePool(CAN_ERASE_ON_RETURN_TO_STORAGE_POOL_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__ELEMENT_TYPES_SUPPORTED:
				getElementTypesSupported().clear();
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
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__ERASURE_METHODS:
				return erasureMethods != null && !erasureMethods.isEmpty();
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__DEFAULT_ERASURE_METHOD:
				return DEFAULT_ERASURE_METHOD_EDEFAULT == null ? defaultErasureMethod != null : !DEFAULT_ERASURE_METHOD_EDEFAULT.equals(defaultErasureMethod);
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__CAN_ERASE_ON_RETURN_TO_STORAGE_POOL:
				return CAN_ERASE_ON_RETURN_TO_STORAGE_POOL_EDEFAULT == null ? canEraseOnReturnToStoragePool != null : !CAN_ERASE_ON_RETURN_TO_STORAGE_POOL_EDEFAULT.equals(canEraseOnReturnToStoragePool);
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES__ELEMENT_TYPES_SUPPORTED:
				return elementTypesSupported != null && !elementTypesSupported.isEmpty();
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
		result.append(" (ErasureMethods: ");
		result.append(erasureMethods);
		result.append(", DefaultErasureMethod: ");
		result.append(defaultErasureMethod);
		result.append(", CanEraseOnReturnToStoragePool: ");
		result.append(canEraseOnReturnToStoragePool);
		result.append(", ElementTypesSupported: ");
		result.append(elementTypesSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageErasureCapabilitiesImpl
