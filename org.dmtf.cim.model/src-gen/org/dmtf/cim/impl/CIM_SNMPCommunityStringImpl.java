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

import org.dmtf.cim.CIM_SNMPCommunityString;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SNMP Community String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPCommunityStringImpl#getCommunityString <em>Community String</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPCommunityStringImpl#getTypeOfAccess <em>Type Of Access</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPCommunityStringImpl#getLogicalEntitiesAccessed <em>Logical Entities Accessed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPCommunityStringImpl#getLogicalEntitiesDescriptions <em>Logical Entities Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SNMPCommunityStringImpl extends CIM_ServiceAccessPointImpl implements CIM_SNMPCommunityString {
	/**
	 * The default value of the '{@link #getCommunityString() <em>Community String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunityString()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNITY_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunityString() <em>Community String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunityString()
	 * @generated
	 * @ordered
	 */
	protected String communityString = COMMUNITY_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeOfAccess() <em>Type Of Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfAccess() <em>Type Of Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfAccess = TYPE_OF_ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogicalEntitiesAccessed() <em>Logical Entities Accessed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalEntitiesAccessed()
	 * @generated
	 * @ordered
	 */
	protected EList<String> logicalEntitiesAccessed;

	/**
	 * The cached value of the '{@link #getLogicalEntitiesDescriptions() <em>Logical Entities Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalEntitiesDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> logicalEntitiesDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SNMPCommunityStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SNMPCommunityString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunityString() {
		return communityString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunityString(String newCommunityString) {
		String oldCommunityString = communityString;
		communityString = newCommunityString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNMP_COMMUNITY_STRING__COMMUNITY_STRING, oldCommunityString, communityString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeOfAccess() {
		return typeOfAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfAccess(Integer newTypeOfAccess) {
		Integer oldTypeOfAccess = typeOfAccess;
		typeOfAccess = newTypeOfAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNMP_COMMUNITY_STRING__TYPE_OF_ACCESS, oldTypeOfAccess, typeOfAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLogicalEntitiesAccessed() {
		if (logicalEntitiesAccessed == null) {
			logicalEntitiesAccessed = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SNMP_COMMUNITY_STRING__LOGICAL_ENTITIES_ACCESSED);
		}
		return logicalEntitiesAccessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLogicalEntitiesDescriptions() {
		if (logicalEntitiesDescriptions == null) {
			logicalEntitiesDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SNMP_COMMUNITY_STRING__LOGICAL_ENTITIES_DESCRIPTIONS);
		}
		return logicalEntitiesDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__COMMUNITY_STRING:
				return getCommunityString();
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__TYPE_OF_ACCESS:
				return getTypeOfAccess();
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__LOGICAL_ENTITIES_ACCESSED:
				return getLogicalEntitiesAccessed();
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__LOGICAL_ENTITIES_DESCRIPTIONS:
				return getLogicalEntitiesDescriptions();
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
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__COMMUNITY_STRING:
				setCommunityString((String)newValue);
				return;
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__TYPE_OF_ACCESS:
				setTypeOfAccess((Integer)newValue);
				return;
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__LOGICAL_ENTITIES_ACCESSED:
				getLogicalEntitiesAccessed().clear();
				getLogicalEntitiesAccessed().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__LOGICAL_ENTITIES_DESCRIPTIONS:
				getLogicalEntitiesDescriptions().clear();
				getLogicalEntitiesDescriptions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__COMMUNITY_STRING:
				setCommunityString(COMMUNITY_STRING_EDEFAULT);
				return;
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__TYPE_OF_ACCESS:
				setTypeOfAccess(TYPE_OF_ACCESS_EDEFAULT);
				return;
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__LOGICAL_ENTITIES_ACCESSED:
				getLogicalEntitiesAccessed().clear();
				return;
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__LOGICAL_ENTITIES_DESCRIPTIONS:
				getLogicalEntitiesDescriptions().clear();
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
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__COMMUNITY_STRING:
				return COMMUNITY_STRING_EDEFAULT == null ? communityString != null : !COMMUNITY_STRING_EDEFAULT.equals(communityString);
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__TYPE_OF_ACCESS:
				return TYPE_OF_ACCESS_EDEFAULT == null ? typeOfAccess != null : !TYPE_OF_ACCESS_EDEFAULT.equals(typeOfAccess);
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__LOGICAL_ENTITIES_ACCESSED:
				return logicalEntitiesAccessed != null && !logicalEntitiesAccessed.isEmpty();
			case CimPackage.CIM_SNMP_COMMUNITY_STRING__LOGICAL_ENTITIES_DESCRIPTIONS:
				return logicalEntitiesDescriptions != null && !logicalEntitiesDescriptions.isEmpty();
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
		result.append(" (CommunityString: ");
		result.append(communityString);
		result.append(", TypeOfAccess: ");
		result.append(typeOfAccess);
		result.append(", LogicalEntitiesAccessed: ");
		result.append(logicalEntitiesAccessed);
		result.append(", LogicalEntitiesDescriptions: ");
		result.append(logicalEntitiesDescriptions);
		result.append(')');
		return result.toString();
	}

} //CIM_SNMPCommunityStringImpl
