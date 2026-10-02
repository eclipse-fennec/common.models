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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.CONTROL_SELECTION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.CONTROL_SELECTION__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
				setDescription((String)newValue);
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
			case OSCALPackage.CONTROL_SELECTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case OSCALPackage.CONTROL_SELECTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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

} //ControlSelectionImpl
