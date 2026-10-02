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

import gov.nist.csrc.ns.oscal.ControlObjectiveSelection;
import gov.nist.csrc.ns.oscal.ControlSelection;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.ReviewedControls;

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
 * An implementation of the model object '<em><b>Reviewed Controls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ReviewedControlsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ReviewedControlsImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ReviewedControlsImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ReviewedControlsImpl#getControlSelection <em>Control Selection</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ReviewedControlsImpl#getControlObjectiveSelection <em>Control Objective Selection</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ReviewedControlsImpl#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReviewedControlsImpl extends MinimalEObjectImpl.Container implements ReviewedControls {
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
	 * The cached value of the '{@link #getControlSelection() <em>Control Selection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSelection()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlSelection> controlSelection;

	/**
	 * The cached value of the '{@link #getControlObjectiveSelection() <em>Control Objective Selection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlObjectiveSelection()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlObjectiveSelection> controlObjectiveSelection;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReviewedControlsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getReviewedControls();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REVIEWED_CONTROLS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.REVIEWED_CONTROLS__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.REVIEWED_CONTROLS__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlSelection> getControlSelection() {
		if (controlSelection == null) {
			controlSelection = new EObjectContainmentEList<ControlSelection>(ControlSelection.class, this, OSCALPackage.REVIEWED_CONTROLS__CONTROL_SELECTION);
		}
		return controlSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlObjectiveSelection> getControlObjectiveSelection() {
		if (controlObjectiveSelection == null) {
			controlObjectiveSelection = new EObjectContainmentEList<ControlObjectiveSelection>(ControlObjectiveSelection.class, this, OSCALPackage.REVIEWED_CONTROLS__CONTROL_OBJECTIVE_SELECTION);
		}
		return controlObjectiveSelection;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REVIEWED_CONTROLS__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.REVIEWED_CONTROLS__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.REVIEWED_CONTROLS__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.REVIEWED_CONTROLS__CONTROL_SELECTION:
				return ((InternalEList<?>)getControlSelection()).basicRemove(otherEnd, msgs);
			case OSCALPackage.REVIEWED_CONTROLS__CONTROL_OBJECTIVE_SELECTION:
				return ((InternalEList<?>)getControlObjectiveSelection()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.REVIEWED_CONTROLS__DESCRIPTION:
				return getDescription();
			case OSCALPackage.REVIEWED_CONTROLS__PROP:
				return getProp();
			case OSCALPackage.REVIEWED_CONTROLS__LINK:
				return getLink();
			case OSCALPackage.REVIEWED_CONTROLS__CONTROL_SELECTION:
				return getControlSelection();
			case OSCALPackage.REVIEWED_CONTROLS__CONTROL_OBJECTIVE_SELECTION:
				return getControlObjectiveSelection();
			case OSCALPackage.REVIEWED_CONTROLS__REMARKS:
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
			case OSCALPackage.REVIEWED_CONTROLS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.REVIEWED_CONTROLS__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.REVIEWED_CONTROLS__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.REVIEWED_CONTROLS__CONTROL_SELECTION:
				getControlSelection().clear();
				getControlSelection().addAll((Collection<? extends ControlSelection>)newValue);
				return;
			case OSCALPackage.REVIEWED_CONTROLS__CONTROL_OBJECTIVE_SELECTION:
				getControlObjectiveSelection().clear();
				getControlObjectiveSelection().addAll((Collection<? extends ControlObjectiveSelection>)newValue);
				return;
			case OSCALPackage.REVIEWED_CONTROLS__REMARKS:
				setRemarks((String)newValue);
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
			case OSCALPackage.REVIEWED_CONTROLS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.REVIEWED_CONTROLS__PROP:
				getProp().clear();
				return;
			case OSCALPackage.REVIEWED_CONTROLS__LINK:
				getLink().clear();
				return;
			case OSCALPackage.REVIEWED_CONTROLS__CONTROL_SELECTION:
				getControlSelection().clear();
				return;
			case OSCALPackage.REVIEWED_CONTROLS__CONTROL_OBJECTIVE_SELECTION:
				getControlObjectiveSelection().clear();
				return;
			case OSCALPackage.REVIEWED_CONTROLS__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
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
			case OSCALPackage.REVIEWED_CONTROLS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.REVIEWED_CONTROLS__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.REVIEWED_CONTROLS__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.REVIEWED_CONTROLS__CONTROL_SELECTION:
				return controlSelection != null && !controlSelection.isEmpty();
			case OSCALPackage.REVIEWED_CONTROLS__CONTROL_OBJECTIVE_SELECTION:
				return controlObjectiveSelection != null && !controlObjectiveSelection.isEmpty();
			case OSCALPackage.REVIEWED_CONTROLS__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
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
		result.append(')');
		return result.toString();
	}

} //ReviewedControlsImpl
