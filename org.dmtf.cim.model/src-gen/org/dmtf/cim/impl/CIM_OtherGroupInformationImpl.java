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

import org.dmtf.cim.CIM_OtherGroupInformation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Other Group Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherGroupInformationImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherGroupInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherGroupInformationImpl#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherGroupInformationImpl#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherGroupInformationImpl#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherGroupInformationImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherGroupInformationImpl#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherGroupInformationImpl#getOU <em>OU</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherGroupInformationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherGroupInformationImpl#getSeeAlso <em>See Also</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OtherGroupInformationImpl extends CIM_ManagedElementImpl implements CIM_OtherGroupInformation {
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
	 * The cached value of the '{@link #getObjectClass() <em>Object Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected EList<String> objectClass;

	/**
	 * The cached value of the '{@link #getBusinessCategory() <em>Business Category</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<String> businessCategory;

	/**
	 * The cached value of the '{@link #getCommonName() <em>Common Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> commonName;

	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> descriptions;

	/**
	 * The cached value of the '{@link #getOrganizationName() <em>Organization Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> organizationName;

	/**
	 * The cached value of the '{@link #getOU() <em>OU</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOU()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ou;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected EList<String> owner;

	/**
	 * The cached value of the '{@link #getSeeAlso() <em>See Also</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeeAlso()
	 * @generated
	 * @ordered
	 */
	protected EList<String> seeAlso;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OtherGroupInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OtherGroupInformation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OTHER_GROUP_INFORMATION__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OTHER_GROUP_INFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getObjectClass() {
		if (objectClass == null) {
			objectClass = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_GROUP_INFORMATION__OBJECT_CLASS);
		}
		return objectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getBusinessCategory() {
		if (businessCategory == null) {
			businessCategory = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_GROUP_INFORMATION__BUSINESS_CATEGORY);
		}
		return businessCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCommonName() {
		if (commonName == null) {
			commonName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_GROUP_INFORMATION__COMMON_NAME);
		}
		return commonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDescriptions() {
		if (descriptions == null) {
			descriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_GROUP_INFORMATION__DESCRIPTIONS);
		}
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOrganizationName() {
		if (organizationName == null) {
			organizationName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_GROUP_INFORMATION__ORGANIZATION_NAME);
		}
		return organizationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOU() {
		if (ou == null) {
			ou = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_GROUP_INFORMATION__OU);
		}
		return ou;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOwner() {
		if (owner == null) {
			owner = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_GROUP_INFORMATION__OWNER);
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSeeAlso() {
		if (seeAlso == null) {
			seeAlso = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_GROUP_INFORMATION__SEE_ALSO);
		}
		return seeAlso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__NAME:
				return getName();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__OBJECT_CLASS:
				return getObjectClass();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__BUSINESS_CATEGORY:
				return getBusinessCategory();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__COMMON_NAME:
				return getCommonName();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__DESCRIPTIONS:
				return getDescriptions();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__ORGANIZATION_NAME:
				return getOrganizationName();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__OU:
				return getOU();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__OWNER:
				return getOwner();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__SEE_ALSO:
				return getSeeAlso();
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
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__OBJECT_CLASS:
				getObjectClass().clear();
				getObjectClass().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__BUSINESS_CATEGORY:
				getBusinessCategory().clear();
				getBusinessCategory().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__COMMON_NAME:
				getCommonName().clear();
				getCommonName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__DESCRIPTIONS:
				getDescriptions().clear();
				getDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__ORGANIZATION_NAME:
				getOrganizationName().clear();
				getOrganizationName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__OU:
				getOU().clear();
				getOU().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__OWNER:
				getOwner().clear();
				getOwner().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__SEE_ALSO:
				getSeeAlso().clear();
				getSeeAlso().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__OBJECT_CLASS:
				getObjectClass().clear();
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__BUSINESS_CATEGORY:
				getBusinessCategory().clear();
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__COMMON_NAME:
				getCommonName().clear();
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__DESCRIPTIONS:
				getDescriptions().clear();
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__ORGANIZATION_NAME:
				getOrganizationName().clear();
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__OU:
				getOU().clear();
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__OWNER:
				getOwner().clear();
				return;
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__SEE_ALSO:
				getSeeAlso().clear();
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
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__OBJECT_CLASS:
				return objectClass != null && !objectClass.isEmpty();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__BUSINESS_CATEGORY:
				return businessCategory != null && !businessCategory.isEmpty();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__COMMON_NAME:
				return commonName != null && !commonName.isEmpty();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__DESCRIPTIONS:
				return descriptions != null && !descriptions.isEmpty();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__ORGANIZATION_NAME:
				return organizationName != null && !organizationName.isEmpty();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__OU:
				return ou != null && !ou.isEmpty();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__OWNER:
				return owner != null && !owner.isEmpty();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION__SEE_ALSO:
				return seeAlso != null && !seeAlso.isEmpty();
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
		result.append(" (CreationClassName: ");
		result.append(creationClassName);
		result.append(", Name: ");
		result.append(name);
		result.append(", ObjectClass: ");
		result.append(objectClass);
		result.append(", BusinessCategory: ");
		result.append(businessCategory);
		result.append(", CommonName: ");
		result.append(commonName);
		result.append(", Descriptions: ");
		result.append(descriptions);
		result.append(", OrganizationName: ");
		result.append(organizationName);
		result.append(", OU: ");
		result.append(ou);
		result.append(", Owner: ");
		result.append(owner);
		result.append(", SeeAlso: ");
		result.append(seeAlso);
		result.append(')');
		return result.toString();
	}

} //CIM_OtherGroupInformationImpl
