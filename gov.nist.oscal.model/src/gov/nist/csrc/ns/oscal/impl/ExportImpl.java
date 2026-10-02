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

import gov.nist.csrc.ns.oscal.Export;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.Provided;
import gov.nist.csrc.ns.oscal.Responsibility;

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
 * An implementation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ExportImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ExportImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ExportImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ExportImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ExportImpl#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ExportImpl#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportImpl extends MinimalEObjectImpl.Container implements Export {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultilineDatatype description;

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
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected EList<Provided> provided;

	/**
	 * The cached value of the '{@link #getResponsibility() <em>Responsibility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibility()
	 * @generated
	 * @ordered
	 */
	protected EList<Responsibility> responsibility;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultilineDatatype remarks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getExport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultilineDatatype getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(MarkupMultilineDatatype newDescription, NotificationChain msgs) {
		MarkupMultilineDatatype oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.EXPORT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(MarkupMultilineDatatype newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.EXPORT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.EXPORT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.EXPORT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.EXPORT__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.EXPORT__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Provided> getProvided() {
		if (provided == null) {
			provided = new EObjectContainmentEList<Provided>(Provided.class, this, OSCALPackage.EXPORT__PROVIDED);
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Responsibility> getResponsibility() {
		if (responsibility == null) {
			responsibility = new EObjectContainmentEList<Responsibility>(Responsibility.class, this, OSCALPackage.EXPORT__RESPONSIBILITY);
		}
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultilineDatatype getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemarks(MarkupMultilineDatatype newRemarks, NotificationChain msgs) {
		MarkupMultilineDatatype oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.EXPORT__REMARKS, oldRemarks, newRemarks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(MarkupMultilineDatatype newRemarks) {
		if (newRemarks != remarks) {
			NotificationChain msgs = null;
			if (remarks != null)
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.EXPORT__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.EXPORT__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.EXPORT__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.EXPORT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case OSCALPackage.EXPORT__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.EXPORT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.EXPORT__PROVIDED:
				return ((InternalEList<?>)getProvided()).basicRemove(otherEnd, msgs);
			case OSCALPackage.EXPORT__RESPONSIBILITY:
				return ((InternalEList<?>)getResponsibility()).basicRemove(otherEnd, msgs);
			case OSCALPackage.EXPORT__REMARKS:
				return basicSetRemarks(null, msgs);
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
			case OSCALPackage.EXPORT__DESCRIPTION:
				return getDescription();
			case OSCALPackage.EXPORT__PROP:
				return getProp();
			case OSCALPackage.EXPORT__LINK:
				return getLink();
			case OSCALPackage.EXPORT__PROVIDED:
				return getProvided();
			case OSCALPackage.EXPORT__RESPONSIBILITY:
				return getResponsibility();
			case OSCALPackage.EXPORT__REMARKS:
				return getRemarks();
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
			case OSCALPackage.EXPORT__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.EXPORT__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.EXPORT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.EXPORT__PROVIDED:
				getProvided().clear();
				getProvided().addAll((Collection<? extends Provided>)newValue);
				return;
			case OSCALPackage.EXPORT__RESPONSIBILITY:
				getResponsibility().clear();
				getResponsibility().addAll((Collection<? extends Responsibility>)newValue);
				return;
			case OSCALPackage.EXPORT__REMARKS:
				setRemarks((MarkupMultilineDatatype)newValue);
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
			case OSCALPackage.EXPORT__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.EXPORT__PROP:
				getProp().clear();
				return;
			case OSCALPackage.EXPORT__LINK:
				getLink().clear();
				return;
			case OSCALPackage.EXPORT__PROVIDED:
				getProvided().clear();
				return;
			case OSCALPackage.EXPORT__RESPONSIBILITY:
				getResponsibility().clear();
				return;
			case OSCALPackage.EXPORT__REMARKS:
				setRemarks((MarkupMultilineDatatype)null);
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
			case OSCALPackage.EXPORT__DESCRIPTION:
				return description != null;
			case OSCALPackage.EXPORT__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.EXPORT__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.EXPORT__PROVIDED:
				return provided != null && !provided.isEmpty();
			case OSCALPackage.EXPORT__RESPONSIBILITY:
				return responsibility != null && !responsibility.isEmpty();
			case OSCALPackage.EXPORT__REMARKS:
				return remarks != null;
		}
		return super.eIsSet(featureID);
	}

} //ExportImpl
