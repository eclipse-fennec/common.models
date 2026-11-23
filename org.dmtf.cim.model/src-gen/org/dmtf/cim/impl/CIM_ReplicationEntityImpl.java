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

import org.dmtf.cim.CIM_ReplicationEntity;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Replication Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationEntityImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationEntityImpl#getEntityID <em>Entity ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationEntityImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationEntityImpl#getPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationEntityImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ReplicationEntityImpl extends CIM_EnabledLogicalElementImpl implements CIM_ReplicationEntity {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Integer type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntityID() <em>Entity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityID()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityID() <em>Entity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityID()
	 * @generated
	 * @ordered
	 */
	protected String entityID = ENTITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherTypeDescription = OTHER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PERSISTENT_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistent()
	 * @generated
	 * @ordered
	 */
	protected Boolean persistent = PERSISTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected String element = ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ReplicationEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ReplicationEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Integer newType) {
		Integer oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_ENTITY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntityID() {
		return entityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityID(String newEntityID) {
		String oldEntityID = entityID;
		entityID = newEntityID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_ENTITY__ENTITY_ID, oldEntityID, entityID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTypeDescription() {
		return otherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTypeDescription(String newOtherTypeDescription) {
		String oldOtherTypeDescription = otherTypeDescription;
		otherTypeDescription = newOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_ENTITY__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistent(Boolean newPersistent) {
		Boolean oldPersistent = persistent;
		persistent = newPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_ENTITY__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(String newElement) {
		String oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_ENTITY__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REPLICATION_ENTITY__TYPE:
				return getType();
			case CimPackage.CIM_REPLICATION_ENTITY__ENTITY_ID:
				return getEntityID();
			case CimPackage.CIM_REPLICATION_ENTITY__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
			case CimPackage.CIM_REPLICATION_ENTITY__PERSISTENT:
				return getPersistent();
			case CimPackage.CIM_REPLICATION_ENTITY__ELEMENT:
				return getElement();
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
			case CimPackage.CIM_REPLICATION_ENTITY__TYPE:
				setType((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_ENTITY__ENTITY_ID:
				setEntityID((String)newValue);
				return;
			case CimPackage.CIM_REPLICATION_ENTITY__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_REPLICATION_ENTITY__PERSISTENT:
				setPersistent((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICATION_ENTITY__ELEMENT:
				setElement((String)newValue);
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
			case CimPackage.CIM_REPLICATION_ENTITY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_ENTITY__ENTITY_ID:
				setEntityID(ENTITY_ID_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_ENTITY__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_ENTITY__PERSISTENT:
				setPersistent(PERSISTENT_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_ENTITY__ELEMENT:
				setElement(ELEMENT_EDEFAULT);
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
			case CimPackage.CIM_REPLICATION_ENTITY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CimPackage.CIM_REPLICATION_ENTITY__ENTITY_ID:
				return ENTITY_ID_EDEFAULT == null ? entityID != null : !ENTITY_ID_EDEFAULT.equals(entityID);
			case CimPackage.CIM_REPLICATION_ENTITY__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
			case CimPackage.CIM_REPLICATION_ENTITY__PERSISTENT:
				return PERSISTENT_EDEFAULT == null ? persistent != null : !PERSISTENT_EDEFAULT.equals(persistent);
			case CimPackage.CIM_REPLICATION_ENTITY__ELEMENT:
				return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
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
		result.append(" (Type: ");
		result.append(type);
		result.append(", EntityID: ");
		result.append(entityID);
		result.append(", OtherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(", Persistent: ");
		result.append(persistent);
		result.append(", Element: ");
		result.append(element);
		result.append(')');
		return result.toString();
	}

} //CIM_ReplicationEntityImpl
