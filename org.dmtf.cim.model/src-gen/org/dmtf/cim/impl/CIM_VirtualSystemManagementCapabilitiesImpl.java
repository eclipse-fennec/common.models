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

import org.dmtf.cim.CIM_VirtualSystemManagementCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Virtual System Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemManagementCapabilitiesImpl#getVirtualSystemTypesSupported <em>Virtual System Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemManagementCapabilitiesImpl#getSynchronousMethodsSupported <em>Synchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemManagementCapabilitiesImpl#getAsynchronousMethodsSupported <em>Asynchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemManagementCapabilitiesImpl#getIndicationsSupported <em>Indications Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VirtualSystemManagementCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_VirtualSystemManagementCapabilities {
	/**
	 * The cached value of the '{@link #getVirtualSystemTypesSupported() <em>Virtual System Types Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSystemTypesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<String> virtualSystemTypesSupported;

	/**
	 * The cached value of the '{@link #getSynchronousMethodsSupported() <em>Synchronous Methods Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousMethodsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> synchronousMethodsSupported;

	/**
	 * The cached value of the '{@link #getAsynchronousMethodsSupported() <em>Asynchronous Methods Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsynchronousMethodsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> asynchronousMethodsSupported;

	/**
	 * The cached value of the '{@link #getIndicationsSupported() <em>Indications Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> indicationsSupported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VirtualSystemManagementCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VirtualSystemManagementCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVirtualSystemTypesSupported() {
		if (virtualSystemTypesSupported == null) {
			virtualSystemTypesSupported = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__VIRTUAL_SYSTEM_TYPES_SUPPORTED);
		}
		return virtualSystemTypesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSynchronousMethodsSupported() {
		if (synchronousMethodsSupported == null) {
			synchronousMethodsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED);
		}
		return synchronousMethodsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAsynchronousMethodsSupported() {
		if (asynchronousMethodsSupported == null) {
			asynchronousMethodsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED);
		}
		return asynchronousMethodsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getIndicationsSupported() {
		if (indicationsSupported == null) {
			indicationsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__INDICATIONS_SUPPORTED);
		}
		return indicationsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__VIRTUAL_SYSTEM_TYPES_SUPPORTED:
				return getVirtualSystemTypesSupported();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				return getSynchronousMethodsSupported();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED:
				return getAsynchronousMethodsSupported();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__INDICATIONS_SUPPORTED:
				return getIndicationsSupported();
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__VIRTUAL_SYSTEM_TYPES_SUPPORTED:
				getVirtualSystemTypesSupported().clear();
				getVirtualSystemTypesSupported().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				getSynchronousMethodsSupported().clear();
				getSynchronousMethodsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED:
				getAsynchronousMethodsSupported().clear();
				getAsynchronousMethodsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__INDICATIONS_SUPPORTED:
				getIndicationsSupported().clear();
				getIndicationsSupported().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__VIRTUAL_SYSTEM_TYPES_SUPPORTED:
				getVirtualSystemTypesSupported().clear();
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				getSynchronousMethodsSupported().clear();
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED:
				getAsynchronousMethodsSupported().clear();
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__INDICATIONS_SUPPORTED:
				getIndicationsSupported().clear();
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__VIRTUAL_SYSTEM_TYPES_SUPPORTED:
				return virtualSystemTypesSupported != null && !virtualSystemTypesSupported.isEmpty();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				return synchronousMethodsSupported != null && !synchronousMethodsSupported.isEmpty();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED:
				return asynchronousMethodsSupported != null && !asynchronousMethodsSupported.isEmpty();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES__INDICATIONS_SUPPORTED:
				return indicationsSupported != null && !indicationsSupported.isEmpty();
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
		result.append(" (VirtualSystemTypesSupported: ");
		result.append(virtualSystemTypesSupported);
		result.append(", SynchronousMethodsSupported: ");
		result.append(synchronousMethodsSupported);
		result.append(", AsynchronousMethodsSupported: ");
		result.append(asynchronousMethodsSupported);
		result.append(", IndicationsSupported: ");
		result.append(indicationsSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_VirtualSystemManagementCapabilitiesImpl
