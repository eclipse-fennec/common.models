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

import org.dmtf.cim.CIM_RoutersInAS;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Routers In AS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutersInASImpl#getBGPSupportedAttributes <em>BGP Supported Attributes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutersInASImpl#getAddCommunityValue <em>Add Community Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutersInASImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutersInASImpl#getOtherRoleDescription <em>Other Role Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RoutersInASImpl extends CIM_SystemComponentImpl implements CIM_RoutersInAS {
	/**
	 * The cached value of the '{@link #getBGPSupportedAttributes() <em>BGP Supported Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPSupportedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> bgpSupportedAttributes;

	/**
	 * The default value of the '{@link #getAddCommunityValue() <em>Add Community Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddCommunityValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ADD_COMMUNITY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddCommunityValue() <em>Add Community Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddCommunityValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean addCommunityValue = ADD_COMMUNITY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Integer role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherRoleDescription() <em>Other Role Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRoleDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ROLE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherRoleDescription() <em>Other Role Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRoleDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherRoleDescription = OTHER_ROLE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RoutersInASImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RoutersInAS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getBGPSupportedAttributes() {
		if (bgpSupportedAttributes == null) {
			bgpSupportedAttributes = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ROUTERS_IN_AS__BGP_SUPPORTED_ATTRIBUTES);
		}
		return bgpSupportedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAddCommunityValue() {
		return addCommunityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddCommunityValue(Boolean newAddCommunityValue) {
		Boolean oldAddCommunityValue = addCommunityValue;
		addCommunityValue = newAddCommunityValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTERS_IN_AS__ADD_COMMUNITY_VALUE, oldAddCommunityValue, addCommunityValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Integer newRole) {
		Integer oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTERS_IN_AS__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherRoleDescription() {
		return otherRoleDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherRoleDescription(String newOtherRoleDescription) {
		String oldOtherRoleDescription = otherRoleDescription;
		otherRoleDescription = newOtherRoleDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTERS_IN_AS__OTHER_ROLE_DESCRIPTION, oldOtherRoleDescription, otherRoleDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ROUTERS_IN_AS__BGP_SUPPORTED_ATTRIBUTES:
				return getBGPSupportedAttributes();
			case CimPackage.CIM_ROUTERS_IN_AS__ADD_COMMUNITY_VALUE:
				return getAddCommunityValue();
			case CimPackage.CIM_ROUTERS_IN_AS__ROLE:
				return getRole();
			case CimPackage.CIM_ROUTERS_IN_AS__OTHER_ROLE_DESCRIPTION:
				return getOtherRoleDescription();
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
			case CimPackage.CIM_ROUTERS_IN_AS__BGP_SUPPORTED_ATTRIBUTES:
				getBGPSupportedAttributes().clear();
				getBGPSupportedAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ROUTERS_IN_AS__ADD_COMMUNITY_VALUE:
				setAddCommunityValue((Boolean)newValue);
				return;
			case CimPackage.CIM_ROUTERS_IN_AS__ROLE:
				setRole((Integer)newValue);
				return;
			case CimPackage.CIM_ROUTERS_IN_AS__OTHER_ROLE_DESCRIPTION:
				setOtherRoleDescription((String)newValue);
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
			case CimPackage.CIM_ROUTERS_IN_AS__BGP_SUPPORTED_ATTRIBUTES:
				getBGPSupportedAttributes().clear();
				return;
			case CimPackage.CIM_ROUTERS_IN_AS__ADD_COMMUNITY_VALUE:
				setAddCommunityValue(ADD_COMMUNITY_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTERS_IN_AS__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTERS_IN_AS__OTHER_ROLE_DESCRIPTION:
				setOtherRoleDescription(OTHER_ROLE_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_ROUTERS_IN_AS__BGP_SUPPORTED_ATTRIBUTES:
				return bgpSupportedAttributes != null && !bgpSupportedAttributes.isEmpty();
			case CimPackage.CIM_ROUTERS_IN_AS__ADD_COMMUNITY_VALUE:
				return ADD_COMMUNITY_VALUE_EDEFAULT == null ? addCommunityValue != null : !ADD_COMMUNITY_VALUE_EDEFAULT.equals(addCommunityValue);
			case CimPackage.CIM_ROUTERS_IN_AS__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CimPackage.CIM_ROUTERS_IN_AS__OTHER_ROLE_DESCRIPTION:
				return OTHER_ROLE_DESCRIPTION_EDEFAULT == null ? otherRoleDescription != null : !OTHER_ROLE_DESCRIPTION_EDEFAULT.equals(otherRoleDescription);
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
		result.append(" (BGPSupportedAttributes: ");
		result.append(bgpSupportedAttributes);
		result.append(", AddCommunityValue: ");
		result.append(addCommunityValue);
		result.append(", Role: ");
		result.append(role);
		result.append(", OtherRoleDescription: ");
		result.append(otherRoleDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_RoutersInASImpl
