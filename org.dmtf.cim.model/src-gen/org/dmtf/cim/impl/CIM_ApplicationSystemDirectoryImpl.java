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

import org.dmtf.cim.CIM_ApplicationSystem;
import org.dmtf.cim.CIM_ApplicationSystemDirectory;
import org.dmtf.cim.CIM_Directory;
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
 * An implementation of the model object '<em><b>CIM Application System Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ApplicationSystemDirectoryImpl#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ApplicationSystemDirectoryImpl#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ApplicationSystemDirectoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ApplicationSystemDirectoryImpl#getApplicationDirectoryUses <em>Application Directory Uses</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ApplicationSystemDirectoryImpl#getOtherUseDescriptions <em>Other Use Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ApplicationSystemDirectoryImpl extends MinimalEObjectImpl.Container implements CIM_ApplicationSystemDirectory {
	/**
	 * The cached value of the '{@link #getAntecedent() <em>Antecedent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedent()
	 * @generated
	 * @ordered
	 */
	protected CIM_Directory antecedent;

	/**
	 * The cached value of the '{@link #getDependent() <em>Dependent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent()
	 * @generated
	 * @ordered
	 */
	protected CIM_ApplicationSystem dependent;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplicationDirectoryUses() <em>Application Directory Uses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationDirectoryUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> applicationDirectoryUses;

	/**
	 * The cached value of the '{@link #getOtherUseDescriptions() <em>Other Use Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUseDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherUseDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ApplicationSystemDirectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ApplicationSystemDirectory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Directory getAntecedent() {
		if (antecedent != null && antecedent.eIsProxy()) {
			InternalEObject oldAntecedent = (InternalEObject)antecedent;
			antecedent = (CIM_Directory)eResolveProxy(oldAntecedent);
			if (antecedent != oldAntecedent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__ANTECEDENT, oldAntecedent, antecedent));
			}
		}
		return antecedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Directory basicGetAntecedent() {
		return antecedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntecedent(CIM_Directory newAntecedent) {
		CIM_Directory oldAntecedent = antecedent;
		antecedent = newAntecedent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__ANTECEDENT, oldAntecedent, antecedent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ApplicationSystem getDependent() {
		if (dependent != null && dependent.eIsProxy()) {
			InternalEObject oldDependent = (InternalEObject)dependent;
			dependent = (CIM_ApplicationSystem)eResolveProxy(oldDependent);
			if (dependent != oldDependent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__DEPENDENT, oldDependent, dependent));
			}
		}
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ApplicationSystem basicGetDependent() {
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependent(CIM_ApplicationSystem newDependent) {
		CIM_ApplicationSystem oldDependent = dependent;
		dependent = newDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__DEPENDENT, oldDependent, dependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getApplicationDirectoryUses() {
		if (applicationDirectoryUses == null) {
			applicationDirectoryUses = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__APPLICATION_DIRECTORY_USES);
		}
		return applicationDirectoryUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherUseDescriptions() {
		if (otherUseDescriptions == null) {
			otherUseDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__OTHER_USE_DESCRIPTIONS);
		}
		return otherUseDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__ANTECEDENT:
				if (resolve) return getAntecedent();
				return basicGetAntecedent();
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__DEPENDENT:
				if (resolve) return getDependent();
				return basicGetDependent();
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__NAME:
				return getName();
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__APPLICATION_DIRECTORY_USES:
				return getApplicationDirectoryUses();
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__OTHER_USE_DESCRIPTIONS:
				return getOtherUseDescriptions();
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
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__ANTECEDENT:
				setAntecedent((CIM_Directory)newValue);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__DEPENDENT:
				setDependent((CIM_ApplicationSystem)newValue);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__APPLICATION_DIRECTORY_USES:
				getApplicationDirectoryUses().clear();
				getApplicationDirectoryUses().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__OTHER_USE_DESCRIPTIONS:
				getOtherUseDescriptions().clear();
				getOtherUseDescriptions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__ANTECEDENT:
				setAntecedent((CIM_Directory)null);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__DEPENDENT:
				setDependent((CIM_ApplicationSystem)null);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__APPLICATION_DIRECTORY_USES:
				getApplicationDirectoryUses().clear();
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__OTHER_USE_DESCRIPTIONS:
				getOtherUseDescriptions().clear();
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
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__ANTECEDENT:
				return antecedent != null;
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__DEPENDENT:
				return dependent != null;
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__APPLICATION_DIRECTORY_USES:
				return applicationDirectoryUses != null && !applicationDirectoryUses.isEmpty();
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY__OTHER_USE_DESCRIPTIONS:
				return otherUseDescriptions != null && !otherUseDescriptions.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", ApplicationDirectoryUses: ");
		result.append(applicationDirectoryUses);
		result.append(", OtherUseDescriptions: ");
		result.append(otherUseDescriptions);
		result.append(')');
		return result.toString();
	}

} //CIM_ApplicationSystemDirectoryImpl
