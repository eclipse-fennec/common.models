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

import gov.nist.csrc.ns.oscal.AssessmentSubject;
import gov.nist.csrc.ns.oscal.IncludeAll;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.SelectSubjectById;

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
 * An implementation of the model object '<em><b>Assessment Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentSubjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentSubjectImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentSubjectImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentSubjectImpl#getIncludeAll <em>Include All</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentSubjectImpl#getIncludeSubject <em>Include Subject</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentSubjectImpl#getExcludeSubject <em>Exclude Subject</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentSubjectImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentSubjectImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessmentSubjectImpl extends MinimalEObjectImpl.Container implements AssessmentSubject {
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
	 * The cached value of the '{@link #getIncludeSubject() <em>Include Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectSubjectById> includeSubject;

	/**
	 * The cached value of the '{@link #getExcludeSubject() <em>Exclude Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectSubjectById> excludeSubject;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getAssessmentSubject();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_SUBJECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.ASSESSMENT_SUBJECT__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.ASSESSMENT_SUBJECT__LINK);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_ALL, oldIncludeAll, newIncludeAll);
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
				msgs = ((InternalEObject)includeAll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_ALL, null, msgs);
			if (newIncludeAll != null)
				msgs = ((InternalEObject)newIncludeAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_ALL, null, msgs);
			msgs = basicSetIncludeAll(newIncludeAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_ALL, newIncludeAll, newIncludeAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectSubjectById> getIncludeSubject() {
		if (includeSubject == null) {
			includeSubject = new EObjectContainmentEList<SelectSubjectById>(SelectSubjectById.class, this, OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_SUBJECT);
		}
		return includeSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectSubjectById> getExcludeSubject() {
		if (excludeSubject == null) {
			excludeSubject = new EObjectContainmentEList<SelectSubjectById>(SelectSubjectById.class, this, OSCALPackage.ASSESSMENT_SUBJECT__EXCLUDE_SUBJECT);
		}
		return excludeSubject;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_SUBJECT__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_SUBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_SUBJECT__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_SUBJECT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_ALL:
				return basicSetIncludeAll(null, msgs);
			case OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_SUBJECT:
				return ((InternalEList<?>)getIncludeSubject()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_SUBJECT__EXCLUDE_SUBJECT:
				return ((InternalEList<?>)getExcludeSubject()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.ASSESSMENT_SUBJECT__DESCRIPTION:
				return getDescription();
			case OSCALPackage.ASSESSMENT_SUBJECT__PROP:
				return getProp();
			case OSCALPackage.ASSESSMENT_SUBJECT__LINK:
				return getLink();
			case OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_ALL:
				return getIncludeAll();
			case OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_SUBJECT:
				return getIncludeSubject();
			case OSCALPackage.ASSESSMENT_SUBJECT__EXCLUDE_SUBJECT:
				return getExcludeSubject();
			case OSCALPackage.ASSESSMENT_SUBJECT__REMARKS:
				return getRemarks();
			case OSCALPackage.ASSESSMENT_SUBJECT__TYPE:
				return getType();
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
			case OSCALPackage.ASSESSMENT_SUBJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_ALL:
				setIncludeAll((IncludeAll)newValue);
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_SUBJECT:
				getIncludeSubject().clear();
				getIncludeSubject().addAll((Collection<? extends SelectSubjectById>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__EXCLUDE_SUBJECT:
				getExcludeSubject().clear();
				getExcludeSubject().addAll((Collection<? extends SelectSubjectById>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__TYPE:
				setType((String)newValue);
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
			case OSCALPackage.ASSESSMENT_SUBJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__PROP:
				getProp().clear();
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__LINK:
				getLink().clear();
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_ALL:
				setIncludeAll((IncludeAll)null);
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_SUBJECT:
				getIncludeSubject().clear();
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__EXCLUDE_SUBJECT:
				getExcludeSubject().clear();
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.ASSESSMENT_SUBJECT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case OSCALPackage.ASSESSMENT_SUBJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.ASSESSMENT_SUBJECT__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.ASSESSMENT_SUBJECT__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_ALL:
				return includeAll != null;
			case OSCALPackage.ASSESSMENT_SUBJECT__INCLUDE_SUBJECT:
				return includeSubject != null && !includeSubject.isEmpty();
			case OSCALPackage.ASSESSMENT_SUBJECT__EXCLUDE_SUBJECT:
				return excludeSubject != null && !excludeSubject.isEmpty();
			case OSCALPackage.ASSESSMENT_SUBJECT__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.ASSESSMENT_SUBJECT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AssessmentSubjectImpl
