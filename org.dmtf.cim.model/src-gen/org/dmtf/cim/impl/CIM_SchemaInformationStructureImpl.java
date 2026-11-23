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

import org.dmtf.cim.CIM_SchemaInformationStructure;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Schema Information Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SchemaInformationStructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SchemaInformationStructureImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SchemaInformationStructureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SchemaInformationStructureImpl#getURI <em>URI</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SchemaInformationStructureImpl#getOwningOrganization <em>Owning Organization</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SchemaInformationStructureImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SchemaInformationStructureImpl extends MinimalEObjectImpl.Container implements CIM_SchemaInformationStructure {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwningOrganization() <em>Owning Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningOrganization() <em>Owning Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningOrganization()
	 * @generated
	 * @ordered
	 */
	protected String owningOrganization = OWNING_ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Long STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Long status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SchemaInformationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SchemaInformationStructure();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getURI() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__URI, oldURI, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwningOrganization() {
		return owningOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningOrganization(String newOwningOrganization) {
		String oldOwningOrganization = owningOrganization;
		owningOrganization = newOwningOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__OWNING_ORGANIZATION, oldOwningOrganization, owningOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Long newStatus) {
		Long oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__NAME:
				return getName();
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__VERSION:
				return getVersion();
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__DESCRIPTION:
				return getDescription();
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__URI:
				return getURI();
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__OWNING_ORGANIZATION:
				return getOwningOrganization();
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__STATUS:
				return getStatus();
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
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__VERSION:
				setVersion((String)newValue);
				return;
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__URI:
				setURI((String)newValue);
				return;
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__OWNING_ORGANIZATION:
				setOwningOrganization((String)newValue);
				return;
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__STATUS:
				setStatus((Long)newValue);
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
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__URI:
				setURI(URI_EDEFAULT);
				return;
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__OWNING_ORGANIZATION:
				setOwningOrganization(OWNING_ORGANIZATION_EDEFAULT);
				return;
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__OWNING_ORGANIZATION:
				return OWNING_ORGANIZATION_EDEFAULT == null ? owningOrganization != null : !OWNING_ORGANIZATION_EDEFAULT.equals(owningOrganization);
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
		result.append(", Version: ");
		result.append(version);
		result.append(", Description: ");
		result.append(description);
		result.append(", URI: ");
		result.append(uri);
		result.append(", OwningOrganization: ");
		result.append(owningOrganization);
		result.append(", Status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //CIM_SchemaInformationStructureImpl
