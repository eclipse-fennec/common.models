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

import org.dmtf.cim.CIM_PhysicalStatisticalInformation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Statistical Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalStatisticalInformationImpl#getPhysicalCreationClassName <em>Physical Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalStatisticalInformationImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalStatisticalInformationImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalStatisticalInformationImpl extends CIM_StatisticalInformationImpl implements CIM_PhysicalStatisticalInformation {
	/**
	 * The default value of the '{@link #getPhysicalCreationClassName() <em>Physical Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalCreationClassName() <em>Physical Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String physicalCreationClassName = PHYSICAL_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalStatisticalInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalStatisticalInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhysicalCreationClassName() {
		return physicalCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalCreationClassName(String newPhysicalCreationClassName) {
		String oldPhysicalCreationClassName = physicalCreationClassName;
		physicalCreationClassName = newPhysicalCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__PHYSICAL_CREATION_CLASS_NAME, oldPhysicalCreationClassName, physicalCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__PHYSICAL_CREATION_CLASS_NAME:
				return getPhysicalCreationClassName();
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__TAG:
				return getTag();
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__CREATION_CLASS_NAME:
				return getCreationClassName();
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
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__PHYSICAL_CREATION_CLASS_NAME:
				setPhysicalCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__TAG:
				setTag((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
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
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__PHYSICAL_CREATION_CLASS_NAME:
				setPhysicalCreationClassName(PHYSICAL_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
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
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__PHYSICAL_CREATION_CLASS_NAME:
				return PHYSICAL_CREATION_CLASS_NAME_EDEFAULT == null ? physicalCreationClassName != null : !PHYSICAL_CREATION_CLASS_NAME_EDEFAULT.equals(physicalCreationClassName);
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
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
		result.append(" (PhysicalCreationClassName: ");
		result.append(physicalCreationClassName);
		result.append(", Tag: ");
		result.append(tag);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalStatisticalInformationImpl
