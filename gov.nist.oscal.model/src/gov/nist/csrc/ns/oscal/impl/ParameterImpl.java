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

import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Parameter;
import gov.nist.csrc.ns.oscal.ParameterConstraint;
import gov.nist.csrc.ns.oscal.ParameterGuideline;
import gov.nist.csrc.ns.oscal.ParameterSelection;
import gov.nist.csrc.ns.oscal.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl#getGuideline <em>Guideline</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected String usage = USAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterConstraint> constraint;

	/**
	 * The cached value of the '{@link #getGuideline() <em>Guideline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideline()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterGuideline> guideline;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> value;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected ParameterSelection select;

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
	 * The default value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDS_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected String dependsOn = DEPENDS_ON_EDEFAULT;

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
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.PARAMETER__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.PARAMETER__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARAMETER__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsage(String newUsage) {
		String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARAMETER__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<ParameterConstraint>(ParameterConstraint.class, this, OSCALPackage.PARAMETER__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterGuideline> getGuideline() {
		if (guideline == null) {
			guideline = new EObjectContainmentEList<ParameterGuideline>(ParameterGuideline.class, this, OSCALPackage.PARAMETER__GUIDELINE);
		}
		return guideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValue() {
		if (value == null) {
			value = new EDataTypeEList<String>(String.class, this, OSCALPackage.PARAMETER__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterSelection getSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelect(ParameterSelection newSelect, NotificationChain msgs) {
		ParameterSelection oldSelect = select;
		select = newSelect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.PARAMETER__SELECT, oldSelect, newSelect);
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
	public void setSelect(ParameterSelection newSelect) {
		if (newSelect != select) {
			NotificationChain msgs = null;
			if (select != null)
				msgs = ((InternalEObject)select).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PARAMETER__SELECT, null, msgs);
			if (newSelect != null)
				msgs = ((InternalEObject)newSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PARAMETER__SELECT, null, msgs);
			msgs = basicSetSelect(newSelect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARAMETER__SELECT, newSelect, newSelect));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARAMETER__REMARKS, oldRemarks, remarks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARAMETER__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependsOn(String newDependsOn) {
		String oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARAMETER__DEPENDS_ON, oldDependsOn, dependsOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PARAMETER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.PARAMETER__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PARAMETER__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PARAMETER__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PARAMETER__GUIDELINE:
				return ((InternalEList<?>)getGuideline()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PARAMETER__SELECT:
				return basicSetSelect(null, msgs);
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
			case OSCALPackage.PARAMETER__PROP:
				return getProp();
			case OSCALPackage.PARAMETER__LINK:
				return getLink();
			case OSCALPackage.PARAMETER__LABEL:
				return getLabel();
			case OSCALPackage.PARAMETER__USAGE:
				return getUsage();
			case OSCALPackage.PARAMETER__CONSTRAINT:
				return getConstraint();
			case OSCALPackage.PARAMETER__GUIDELINE:
				return getGuideline();
			case OSCALPackage.PARAMETER__VALUE:
				return getValue();
			case OSCALPackage.PARAMETER__SELECT:
				return getSelect();
			case OSCALPackage.PARAMETER__REMARKS:
				return getRemarks();
			case OSCALPackage.PARAMETER__CLASS:
				return getClass_();
			case OSCALPackage.PARAMETER__DEPENDS_ON:
				return getDependsOn();
			case OSCALPackage.PARAMETER__ID:
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
			case OSCALPackage.PARAMETER__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.PARAMETER__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.PARAMETER__LABEL:
				setLabel((String)newValue);
				return;
			case OSCALPackage.PARAMETER__USAGE:
				setUsage((String)newValue);
				return;
			case OSCALPackage.PARAMETER__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends ParameterConstraint>)newValue);
				return;
			case OSCALPackage.PARAMETER__GUIDELINE:
				getGuideline().clear();
				getGuideline().addAll((Collection<? extends ParameterGuideline>)newValue);
				return;
			case OSCALPackage.PARAMETER__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends String>)newValue);
				return;
			case OSCALPackage.PARAMETER__SELECT:
				setSelect((ParameterSelection)newValue);
				return;
			case OSCALPackage.PARAMETER__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.PARAMETER__CLASS:
				setClass((String)newValue);
				return;
			case OSCALPackage.PARAMETER__DEPENDS_ON:
				setDependsOn((String)newValue);
				return;
			case OSCALPackage.PARAMETER__ID:
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
			case OSCALPackage.PARAMETER__PROP:
				getProp().clear();
				return;
			case OSCALPackage.PARAMETER__LINK:
				getLink().clear();
				return;
			case OSCALPackage.PARAMETER__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case OSCALPackage.PARAMETER__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case OSCALPackage.PARAMETER__CONSTRAINT:
				getConstraint().clear();
				return;
			case OSCALPackage.PARAMETER__GUIDELINE:
				getGuideline().clear();
				return;
			case OSCALPackage.PARAMETER__VALUE:
				getValue().clear();
				return;
			case OSCALPackage.PARAMETER__SELECT:
				setSelect((ParameterSelection)null);
				return;
			case OSCALPackage.PARAMETER__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.PARAMETER__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case OSCALPackage.PARAMETER__DEPENDS_ON:
				setDependsOn(DEPENDS_ON_EDEFAULT);
				return;
			case OSCALPackage.PARAMETER__ID:
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
			case OSCALPackage.PARAMETER__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.PARAMETER__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.PARAMETER__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case OSCALPackage.PARAMETER__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
			case OSCALPackage.PARAMETER__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case OSCALPackage.PARAMETER__GUIDELINE:
				return guideline != null && !guideline.isEmpty();
			case OSCALPackage.PARAMETER__VALUE:
				return value != null && !value.isEmpty();
			case OSCALPackage.PARAMETER__SELECT:
				return select != null;
			case OSCALPackage.PARAMETER__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.PARAMETER__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case OSCALPackage.PARAMETER__DEPENDS_ON:
				return DEPENDS_ON_EDEFAULT == null ? dependsOn != null : !DEPENDS_ON_EDEFAULT.equals(dependsOn);
			case OSCALPackage.PARAMETER__ID:
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
		result.append(" (label: ");
		result.append(label);
		result.append(", usage: ");
		result.append(usage);
		result.append(", value: ");
		result.append(value);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", class: ");
		result.append(class_);
		result.append(", dependsOn: ");
		result.append(dependsOn);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
