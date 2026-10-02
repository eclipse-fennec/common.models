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

import gov.nist.csrc.ns.oscal.CatalogGroup;
import gov.nist.csrc.ns.oscal.Control;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Parameter;
import gov.nist.csrc.ns.oscal.Part;
import gov.nist.csrc.ns.oscal.Property;

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
 * An implementation of the model object '<em><b>Catalog Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogGroupImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogGroupImpl#getParam <em>Param</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogGroupImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogGroupImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogGroupImpl#getPart <em>Part</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogGroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogGroupImpl#getControl <em>Control</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogGroupImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogGroupImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogGroupImpl extends MinimalEObjectImpl.Container implements CatalogGroup {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> param;

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
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> part;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<CatalogGroup> group;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> control;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getCatalogGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.CATALOG_GROUP__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParam() {
		if (param == null) {
			param = new EObjectContainmentEList<Parameter>(Parameter.class, this, OSCALPackage.CATALOG_GROUP__PARAM);
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.CATALOG_GROUP__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.CATALOG_GROUP__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Part> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<Part>(Part.class, this, OSCALPackage.CATALOG_GROUP__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatalogGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<CatalogGroup>(CatalogGroup.class, this, OSCALPackage.CATALOG_GROUP__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getControl() {
		if (control == null) {
			control = new EObjectContainmentEList<Control>(Control.class, this, OSCALPackage.CATALOG_GROUP__CONTROL);
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.CATALOG_GROUP__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.CATALOG_GROUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.CATALOG_GROUP__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CATALOG_GROUP__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CATALOG_GROUP__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CATALOG_GROUP__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CATALOG_GROUP__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CATALOG_GROUP__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.CATALOG_GROUP__TITLE:
				return getTitle();
			case OSCALPackage.CATALOG_GROUP__PARAM:
				return getParam();
			case OSCALPackage.CATALOG_GROUP__PROP:
				return getProp();
			case OSCALPackage.CATALOG_GROUP__LINK:
				return getLink();
			case OSCALPackage.CATALOG_GROUP__PART:
				return getPart();
			case OSCALPackage.CATALOG_GROUP__GROUP:
				return getGroup();
			case OSCALPackage.CATALOG_GROUP__CONTROL:
				return getControl();
			case OSCALPackage.CATALOG_GROUP__CLASS:
				return getClass_();
			case OSCALPackage.CATALOG_GROUP__ID:
				return getId();
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
			case OSCALPackage.CATALOG_GROUP__TITLE:
				setTitle((String)newValue);
				return;
			case OSCALPackage.CATALOG_GROUP__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends Parameter>)newValue);
				return;
			case OSCALPackage.CATALOG_GROUP__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.CATALOG_GROUP__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.CATALOG_GROUP__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends Part>)newValue);
				return;
			case OSCALPackage.CATALOG_GROUP__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends CatalogGroup>)newValue);
				return;
			case OSCALPackage.CATALOG_GROUP__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends Control>)newValue);
				return;
			case OSCALPackage.CATALOG_GROUP__CLASS:
				setClass((String)newValue);
				return;
			case OSCALPackage.CATALOG_GROUP__ID:
				setId((String)newValue);
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
			case OSCALPackage.CATALOG_GROUP__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OSCALPackage.CATALOG_GROUP__PARAM:
				getParam().clear();
				return;
			case OSCALPackage.CATALOG_GROUP__PROP:
				getProp().clear();
				return;
			case OSCALPackage.CATALOG_GROUP__LINK:
				getLink().clear();
				return;
			case OSCALPackage.CATALOG_GROUP__PART:
				getPart().clear();
				return;
			case OSCALPackage.CATALOG_GROUP__GROUP:
				getGroup().clear();
				return;
			case OSCALPackage.CATALOG_GROUP__CONTROL:
				getControl().clear();
				return;
			case OSCALPackage.CATALOG_GROUP__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case OSCALPackage.CATALOG_GROUP__ID:
				setId(ID_EDEFAULT);
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
			case OSCALPackage.CATALOG_GROUP__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OSCALPackage.CATALOG_GROUP__PARAM:
				return param != null && !param.isEmpty();
			case OSCALPackage.CATALOG_GROUP__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.CATALOG_GROUP__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.CATALOG_GROUP__PART:
				return part != null && !part.isEmpty();
			case OSCALPackage.CATALOG_GROUP__GROUP:
				return group != null && !group.isEmpty();
			case OSCALPackage.CATALOG_GROUP__CONTROL:
				return control != null && !control.isEmpty();
			case OSCALPackage.CATALOG_GROUP__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case OSCALPackage.CATALOG_GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", class: ");
		result.append(class_);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CatalogGroupImpl
