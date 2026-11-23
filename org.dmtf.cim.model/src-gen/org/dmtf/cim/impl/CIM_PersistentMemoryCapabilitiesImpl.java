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

import org.dmtf.cim.CIM_PersistentMemoryCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Persistent Memory Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersistentMemoryCapabilitiesImpl#getSecurityFeatures <em>Security Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersistentMemoryCapabilitiesImpl#getAccessGranularity <em>Access Granularity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersistentMemoryCapabilitiesImpl#getReplication <em>Replication</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersistentMemoryCapabilitiesImpl#getMemoryArchitecture <em>Memory Architecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PersistentMemoryCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_PersistentMemoryCapabilities {
	/**
	 * The cached value of the '{@link #getSecurityFeatures() <em>Security Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> securityFeatures;

	/**
	 * The cached value of the '{@link #getAccessGranularity() <em>Access Granularity</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessGranularity()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> accessGranularity;

	/**
	 * The cached value of the '{@link #getReplication() <em>Replication</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> replication;

	/**
	 * The cached value of the '{@link #getMemoryArchitecture() <em>Memory Architecture</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryArchitecture()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> memoryArchitecture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PersistentMemoryCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PersistentMemoryCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSecurityFeatures() {
		if (securityFeatures == null) {
			securityFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__SECURITY_FEATURES);
		}
		return securityFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAccessGranularity() {
		if (accessGranularity == null) {
			accessGranularity = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__ACCESS_GRANULARITY);
		}
		return accessGranularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getReplication() {
		if (replication == null) {
			replication = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__REPLICATION);
		}
		return replication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMemoryArchitecture() {
		if (memoryArchitecture == null) {
			memoryArchitecture = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__MEMORY_ARCHITECTURE);
		}
		return memoryArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__SECURITY_FEATURES:
				return getSecurityFeatures();
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__ACCESS_GRANULARITY:
				return getAccessGranularity();
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__REPLICATION:
				return getReplication();
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__MEMORY_ARCHITECTURE:
				return getMemoryArchitecture();
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
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__SECURITY_FEATURES:
				getSecurityFeatures().clear();
				getSecurityFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__ACCESS_GRANULARITY:
				getAccessGranularity().clear();
				getAccessGranularity().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__REPLICATION:
				getReplication().clear();
				getReplication().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__MEMORY_ARCHITECTURE:
				getMemoryArchitecture().clear();
				getMemoryArchitecture().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__SECURITY_FEATURES:
				getSecurityFeatures().clear();
				return;
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__ACCESS_GRANULARITY:
				getAccessGranularity().clear();
				return;
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__REPLICATION:
				getReplication().clear();
				return;
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__MEMORY_ARCHITECTURE:
				getMemoryArchitecture().clear();
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
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__SECURITY_FEATURES:
				return securityFeatures != null && !securityFeatures.isEmpty();
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__ACCESS_GRANULARITY:
				return accessGranularity != null && !accessGranularity.isEmpty();
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__REPLICATION:
				return replication != null && !replication.isEmpty();
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES__MEMORY_ARCHITECTURE:
				return memoryArchitecture != null && !memoryArchitecture.isEmpty();
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
		result.append(" (SecurityFeatures: ");
		result.append(securityFeatures);
		result.append(", AccessGranularity: ");
		result.append(accessGranularity);
		result.append(", Replication: ");
		result.append(replication);
		result.append(", MemoryArchitecture: ");
		result.append(memoryArchitecture);
		result.append(')');
		return result.toString();
	}

} //CIM_PersistentMemoryCapabilitiesImpl
