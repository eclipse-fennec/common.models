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

import gov.nist.csrc.ns.oscal.AssessmentSelectControlById;
import gov.nist.csrc.ns.oscal.ControlSelection;
import gov.nist.csrc.ns.oscal.IncludeAll;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
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
 * An implementation of the model object '<em><b>Control Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ControlSelectionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ControlSelectionImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ControlSelectionImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ControlSelectionImpl#getIncludeAll <em>Include All</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ControlSelectionImpl#getIncludeControl <em>Include Control</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ControlSelectionImpl#getExcludeControl <em>Exclude Control</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ControlSelectionImpl#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSelectionImpl extends MinimalEObjectImpl.Container implements ControlSelection {
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
	 * The cached value of the '{@link #getIncludeAll() <em>Include All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAll()
	 * @generated
	 * @ordered
	 */
	protected IncludeAll includeAll;

	/**
	 * The cached value of the '{@link #getIncludeControl() <em>Include Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeControl()
	 * @generated
	 * @ordered
	 */
	protected EList<AssessmentSelectControlById> includeControl;

	/**
	 * The cached value of the '{@link #getExcludeControl() <em>Exclude Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeControl()
	 * @generated
	 * @ordered
	 */
	protected EList<AssessmentSelectControlById> excludeControl;

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
	protected ControlSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getControlSelection();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.CONTROL_SELECTION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.CONTROL_SELECTION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.CONTROL_SELECTION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.CONTROL_SELECTION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.CONTROL_SELECTION__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.CONTROL_SELECTION__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncludeAll getIncludeAll() {
		return includeAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludeAll(IncludeAll newIncludeAll, NotificationChain msgs) {
		IncludeAll oldIncludeAll = includeAll;
		includeAll = newIncludeAll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.CONTROL_SELECTION__INCLUDE_ALL, oldIncludeAll, newIncludeAll);
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
	public void setIncludeAll(IncludeAll newIncludeAll) {
		if (newIncludeAll != includeAll) {
			NotificationChain msgs = null;
			if (includeAll != null)
				msgs = ((InternalEObject)includeAll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.CONTROL_SELECTION__INCLUDE_ALL, null, msgs);
			if (newIncludeAll != null)
				msgs = ((InternalEObject)newIncludeAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.CONTROL_SELECTION__INCLUDE_ALL, null, msgs);
			msgs = basicSetIncludeAll(newIncludeAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.CONTROL_SELECTION__INCLUDE_ALL, newIncludeAll, newIncludeAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssessmentSelectControlById> getIncludeControl() {
		if (includeControl == null) {
			includeControl = new EObjectContainmentEList<AssessmentSelectControlById>(AssessmentSelectControlById.class, this, OSCALPackage.CONTROL_SELECTION__INCLUDE_CONTROL);
		}
		return includeControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssessmentSelectControlById> getExcludeControl() {
		if (excludeControl == null) {
			excludeControl = new EObjectContainmentEList<AssessmentSelectControlById>(AssessmentSelectControlById.class, this, OSCALPackage.CONTROL_SELECTION__EXCLUDE_CONTROL);
		}
		return excludeControl;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.CONTROL_SELECTION__REMARKS, oldRemarks, newRemarks);
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
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.CONTROL_SELECTION__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.CONTROL_SELECTION__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.CONTROL_SELECTION__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.CONTROL_SELECTION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case OSCALPackage.CONTROL_SELECTION__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CONTROL_SELECTION__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CONTROL_SELECTION__INCLUDE_ALL:
				return basicSetIncludeAll(null, msgs);
			case OSCALPackage.CONTROL_SELECTION__INCLUDE_CONTROL:
				return ((InternalEList<?>)getIncludeControl()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CONTROL_SELECTION__EXCLUDE_CONTROL:
				return ((InternalEList<?>)getExcludeControl()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CONTROL_SELECTION__REMARKS:
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
			case OSCALPackage.CONTROL_SELECTION__DESCRIPTION:
				return getDescription();
			case OSCALPackage.CONTROL_SELECTION__PROP:
				return getProp();
			case OSCALPackage.CONTROL_SELECTION__LINK:
				return getLink();
			case OSCALPackage.CONTROL_SELECTION__INCLUDE_ALL:
				return getIncludeAll();
			case OSCALPackage.CONTROL_SELECTION__INCLUDE_CONTROL:
				return getIncludeControl();
			case OSCALPackage.CONTROL_SELECTION__EXCLUDE_CONTROL:
				return getExcludeControl();
			case OSCALPackage.CONTROL_SELECTION__REMARKS:
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
			case OSCALPackage.CONTROL_SELECTION__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.CONTROL_SELECTION__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.CONTROL_SELECTION__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.CONTROL_SELECTION__INCLUDE_ALL:
				setIncludeAll((IncludeAll)newValue);
				return;
			case OSCALPackage.CONTROL_SELECTION__INCLUDE_CONTROL:
				getIncludeControl().clear();
				getIncludeControl().addAll((Collection<? extends AssessmentSelectControlById>)newValue);
				return;
			case OSCALPackage.CONTROL_SELECTION__EXCLUDE_CONTROL:
				getExcludeControl().clear();
				getExcludeControl().addAll((Collection<? extends AssessmentSelectControlById>)newValue);
				return;
			case OSCALPackage.CONTROL_SELECTION__REMARKS:
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
			case OSCALPackage.CONTROL_SELECTION__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.CONTROL_SELECTION__PROP:
				getProp().clear();
				return;
			case OSCALPackage.CONTROL_SELECTION__LINK:
				getLink().clear();
				return;
			case OSCALPackage.CONTROL_SELECTION__INCLUDE_ALL:
				setIncludeAll((IncludeAll)null);
				return;
			case OSCALPackage.CONTROL_SELECTION__INCLUDE_CONTROL:
				getIncludeControl().clear();
				return;
			case OSCALPackage.CONTROL_SELECTION__EXCLUDE_CONTROL:
				getExcludeControl().clear();
				return;
			case OSCALPackage.CONTROL_SELECTION__REMARKS:
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
			case OSCALPackage.CONTROL_SELECTION__DESCRIPTION:
				return description != null;
			case OSCALPackage.CONTROL_SELECTION__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.CONTROL_SELECTION__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.CONTROL_SELECTION__INCLUDE_ALL:
				return includeAll != null;
			case OSCALPackage.CONTROL_SELECTION__INCLUDE_CONTROL:
				return includeControl != null && !includeControl.isEmpty();
			case OSCALPackage.CONTROL_SELECTION__EXCLUDE_CONTROL:
				return excludeControl != null && !excludeControl.isEmpty();
			case OSCALPackage.CONTROL_SELECTION__REMARKS:
				return remarks != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSelectionImpl
