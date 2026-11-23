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

import org.dmtf.cim.CIM_Namespace;
import org.dmtf.cim.CIM_SystemIdentification;
import org.dmtf.cim.CIM_SystemInNamespace;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM System In Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemInNamespaceImpl#getManagedNamespace <em>Managed Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemInNamespaceImpl#getIdentification <em>Identification</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemInNamespaceImpl#getScopeOfContainedData <em>Scope Of Contained Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemInNamespaceImpl#getDescriptionOfContainedData <em>Description Of Contained Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SystemInNamespaceImpl extends MinimalEObjectImpl.Container implements CIM_SystemInNamespace {
	/**
	 * The cached value of the '{@link #getManagedNamespace() <em>Managed Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedNamespace()
	 * @generated
	 * @ordered
	 */
	protected CIM_Namespace managedNamespace;

	/**
	 * The cached value of the '{@link #getIdentification() <em>Identification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentification()
	 * @generated
	 * @ordered
	 */
	protected CIM_SystemIdentification identification;

	/**
	 * The cached value of the '{@link #getScopeOfContainedData() <em>Scope Of Contained Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeOfContainedData()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> scopeOfContainedData;

	/**
	 * The cached value of the '{@link #getDescriptionOfContainedData() <em>Description Of Contained Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionOfContainedData()
	 * @generated
	 * @ordered
	 */
	protected EList<String> descriptionOfContainedData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SystemInNamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SystemInNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Namespace getManagedNamespace() {
		if (managedNamespace != null && managedNamespace.eIsProxy()) {
			InternalEObject oldManagedNamespace = (InternalEObject)managedNamespace;
			managedNamespace = (CIM_Namespace)eResolveProxy(oldManagedNamespace);
			if (managedNamespace != oldManagedNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SYSTEM_IN_NAMESPACE__MANAGED_NAMESPACE, oldManagedNamespace, managedNamespace));
			}
		}
		return managedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Namespace basicGetManagedNamespace() {
		return managedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagedNamespace(CIM_Namespace newManagedNamespace) {
		CIM_Namespace oldManagedNamespace = managedNamespace;
		managedNamespace = newManagedNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_IN_NAMESPACE__MANAGED_NAMESPACE, oldManagedNamespace, managedNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemIdentification getIdentification() {
		if (identification != null && identification.eIsProxy()) {
			InternalEObject oldIdentification = (InternalEObject)identification;
			identification = (CIM_SystemIdentification)eResolveProxy(oldIdentification);
			if (identification != oldIdentification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SYSTEM_IN_NAMESPACE__IDENTIFICATION, oldIdentification, identification));
			}
		}
		return identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_SystemIdentification basicGetIdentification() {
		return identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentification(CIM_SystemIdentification newIdentification) {
		CIM_SystemIdentification oldIdentification = identification;
		identification = newIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_IN_NAMESPACE__IDENTIFICATION, oldIdentification, identification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getScopeOfContainedData() {
		if (scopeOfContainedData == null) {
			scopeOfContainedData = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SYSTEM_IN_NAMESPACE__SCOPE_OF_CONTAINED_DATA);
		}
		return scopeOfContainedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDescriptionOfContainedData() {
		if (descriptionOfContainedData == null) {
			descriptionOfContainedData = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SYSTEM_IN_NAMESPACE__DESCRIPTION_OF_CONTAINED_DATA);
		}
		return descriptionOfContainedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__MANAGED_NAMESPACE:
				if (resolve) return getManagedNamespace();
				return basicGetManagedNamespace();
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__IDENTIFICATION:
				if (resolve) return getIdentification();
				return basicGetIdentification();
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__SCOPE_OF_CONTAINED_DATA:
				return getScopeOfContainedData();
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__DESCRIPTION_OF_CONTAINED_DATA:
				return getDescriptionOfContainedData();
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
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__MANAGED_NAMESPACE:
				setManagedNamespace((CIM_Namespace)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__IDENTIFICATION:
				setIdentification((CIM_SystemIdentification)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__SCOPE_OF_CONTAINED_DATA:
				getScopeOfContainedData().clear();
				getScopeOfContainedData().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__DESCRIPTION_OF_CONTAINED_DATA:
				getDescriptionOfContainedData().clear();
				getDescriptionOfContainedData().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__MANAGED_NAMESPACE:
				setManagedNamespace((CIM_Namespace)null);
				return;
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__IDENTIFICATION:
				setIdentification((CIM_SystemIdentification)null);
				return;
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__SCOPE_OF_CONTAINED_DATA:
				getScopeOfContainedData().clear();
				return;
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__DESCRIPTION_OF_CONTAINED_DATA:
				getDescriptionOfContainedData().clear();
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
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__MANAGED_NAMESPACE:
				return managedNamespace != null;
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__IDENTIFICATION:
				return identification != null;
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__SCOPE_OF_CONTAINED_DATA:
				return scopeOfContainedData != null && !scopeOfContainedData.isEmpty();
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE__DESCRIPTION_OF_CONTAINED_DATA:
				return descriptionOfContainedData != null && !descriptionOfContainedData.isEmpty();
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
		result.append(" (ScopeOfContainedData: ");
		result.append(scopeOfContainedData);
		result.append(", DescriptionOfContainedData: ");
		result.append(descriptionOfContainedData);
		result.append(')');
		return result.toString();
	}

} //CIM_SystemInNamespaceImpl
