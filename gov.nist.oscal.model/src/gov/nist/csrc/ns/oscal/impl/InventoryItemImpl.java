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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.ImplementedComponent;
import gov.nist.csrc.ns.oscal.InventoryItem;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.ResponsibleParty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InventoryItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InventoryItemImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InventoryItemImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InventoryItemImpl#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InventoryItemImpl#getImplementedComponent <em>Implemented Component</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InventoryItemImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InventoryItemImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemImpl extends MinimalEObjectImpl.Container implements InventoryItem {
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
	 * The cached value of the '{@link #getProp() <em>Prop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProp()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> prop;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getResponsibleParty() <em>Responsible Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParty()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibleParty> responsibleParty;

	/**
	 * The cached value of the '{@link #getImplementedComponent() <em>Implemented Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementedComponent> implementedComponent;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getInventoryItem();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INVENTORY_ITEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.INVENTORY_ITEM__PROP);
		}
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.INVENTORY_ITEM__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponsibleParty> getResponsibleParty() {
		if (responsibleParty == null) {
			responsibleParty = new EObjectContainmentEList<ResponsibleParty>(ResponsibleParty.class, this, OSCALPackage.INVENTORY_ITEM__RESPONSIBLE_PARTY);
		}
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImplementedComponent> getImplementedComponent() {
		if (implementedComponent == null) {
			implementedComponent = new EObjectContainmentEList<ImplementedComponent>(ImplementedComponent.class, this, OSCALPackage.INVENTORY_ITEM__IMPLEMENTED_COMPONENT);
		}
		return implementedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INVENTORY_ITEM__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INVENTORY_ITEM__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.INVENTORY_ITEM__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INVENTORY_ITEM__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INVENTORY_ITEM__RESPONSIBLE_PARTY:
				return ((InternalEList<?>)getResponsibleParty()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INVENTORY_ITEM__IMPLEMENTED_COMPONENT:
				return ((InternalEList<?>)getImplementedComponent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.INVENTORY_ITEM__DESCRIPTION:
				return getDescription();
			case OSCALPackage.INVENTORY_ITEM__PROP:
				return getProp();
			case OSCALPackage.INVENTORY_ITEM__LINK:
				return getLink();
			case OSCALPackage.INVENTORY_ITEM__RESPONSIBLE_PARTY:
				return getResponsibleParty();
			case OSCALPackage.INVENTORY_ITEM__IMPLEMENTED_COMPONENT:
				return getImplementedComponent();
			case OSCALPackage.INVENTORY_ITEM__REMARKS:
				return getRemarks();
			case OSCALPackage.INVENTORY_ITEM__UUID:
				return getUuid();
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
			case OSCALPackage.INVENTORY_ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.INVENTORY_ITEM__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.INVENTORY_ITEM__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.INVENTORY_ITEM__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				getResponsibleParty().addAll((Collection<? extends ResponsibleParty>)newValue);
				return;
			case OSCALPackage.INVENTORY_ITEM__IMPLEMENTED_COMPONENT:
				getImplementedComponent().clear();
				getImplementedComponent().addAll((Collection<? extends ImplementedComponent>)newValue);
				return;
			case OSCALPackage.INVENTORY_ITEM__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.INVENTORY_ITEM__UUID:
				setUuid((String)newValue);
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
			case OSCALPackage.INVENTORY_ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.INVENTORY_ITEM__PROP:
				getProp().clear();
				return;
			case OSCALPackage.INVENTORY_ITEM__LINK:
				getLink().clear();
				return;
			case OSCALPackage.INVENTORY_ITEM__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				return;
			case OSCALPackage.INVENTORY_ITEM__IMPLEMENTED_COMPONENT:
				getImplementedComponent().clear();
				return;
			case OSCALPackage.INVENTORY_ITEM__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.INVENTORY_ITEM__UUID:
				setUuid(UUID_EDEFAULT);
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
			case OSCALPackage.INVENTORY_ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.INVENTORY_ITEM__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.INVENTORY_ITEM__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.INVENTORY_ITEM__RESPONSIBLE_PARTY:
				return responsibleParty != null && !responsibleParty.isEmpty();
			case OSCALPackage.INVENTORY_ITEM__IMPLEMENTED_COMPONENT:
				return implementedComponent != null && !implementedComponent.isEmpty();
			case OSCALPackage.INVENTORY_ITEM__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.INVENTORY_ITEM__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //InventoryItemImpl
