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

import gov.nist.csrc.ns.oscal.ByComponent;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.ResponsibleRole;
import gov.nist.csrc.ns.oscal.SetParameter;
import gov.nist.csrc.ns.oscal.SspImplementedRequirement;
import gov.nist.csrc.ns.oscal.SspStatement;

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
 * An implementation of the model object '<em><b>Ssp Implemented Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SspImplementedRequirementImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SspImplementedRequirementImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SspImplementedRequirementImpl#getSetParameter <em>Set Parameter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SspImplementedRequirementImpl#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SspImplementedRequirementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SspImplementedRequirementImpl#getByComponent <em>By Component</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SspImplementedRequirementImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SspImplementedRequirementImpl#getControlId <em>Control Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SspImplementedRequirementImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SspImplementedRequirementImpl extends MinimalEObjectImpl.Container implements SspImplementedRequirement {
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
	 * The cached value of the '{@link #getSetParameter() <em>Set Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<SetParameter> setParameter;

	/**
	 * The cached value of the '{@link #getResponsibleRole() <em>Responsible Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleRole()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibleRole> responsibleRole;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<SspStatement> statement;

	/**
	 * The cached value of the '{@link #getByComponent() <em>By Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ByComponent> byComponent;

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
	 * The default value of the '{@link #getControlId() <em>Control Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlId() <em>Control Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlId()
	 * @generated
	 * @ordered
	 */
	protected String controlId = CONTROL_ID_EDEFAULT;

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
	protected SspImplementedRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getSspImplementedRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetParameter> getSetParameter() {
		if (setParameter == null) {
			setParameter = new EObjectContainmentEList<SetParameter>(SetParameter.class, this, OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__SET_PARAMETER);
		}
		return setParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponsibleRole> getResponsibleRole() {
		if (responsibleRole == null) {
			responsibleRole = new EObjectContainmentEList<ResponsibleRole>(ResponsibleRole.class, this, OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__RESPONSIBLE_ROLE);
		}
		return responsibleRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SspStatement> getStatement() {
		if (statement == null) {
			statement = new EObjectContainmentEList<SspStatement>(SspStatement.class, this, OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__STATEMENT);
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ByComponent> getByComponent() {
		if (byComponent == null) {
			byComponent = new EObjectContainmentEList<ByComponent>(ByComponent.class, this, OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__BY_COMPONENT);
		}
		return byComponent;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__REMARKS, oldRemarks, newRemarks);
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
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getControlId() {
		return controlId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlId(String newControlId) {
		String oldControlId = controlId;
		controlId = newControlId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__CONTROL_ID, oldControlId, controlId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__SET_PARAMETER:
				return ((InternalEList<?>)getSetParameter()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__RESPONSIBLE_ROLE:
				return ((InternalEList<?>)getResponsibleRole()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__BY_COMPONENT:
				return ((InternalEList<?>)getByComponent()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__REMARKS:
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
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__PROP:
				return getProp();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__LINK:
				return getLink();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__SET_PARAMETER:
				return getSetParameter();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__RESPONSIBLE_ROLE:
				return getResponsibleRole();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__STATEMENT:
				return getStatement();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__BY_COMPONENT:
				return getByComponent();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__REMARKS:
				return getRemarks();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__CONTROL_ID:
				return getControlId();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__UUID:
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
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__SET_PARAMETER:
				getSetParameter().clear();
				getSetParameter().addAll((Collection<? extends SetParameter>)newValue);
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				getResponsibleRole().addAll((Collection<? extends ResponsibleRole>)newValue);
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends SspStatement>)newValue);
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__BY_COMPONENT:
				getByComponent().clear();
				getByComponent().addAll((Collection<? extends ByComponent>)newValue);
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__REMARKS:
				setRemarks((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__CONTROL_ID:
				setControlId((String)newValue);
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__UUID:
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
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__PROP:
				getProp().clear();
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__LINK:
				getLink().clear();
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__SET_PARAMETER:
				getSetParameter().clear();
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__STATEMENT:
				getStatement().clear();
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__BY_COMPONENT:
				getByComponent().clear();
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__REMARKS:
				setRemarks((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__CONTROL_ID:
				setControlId(CONTROL_ID_EDEFAULT);
				return;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__UUID:
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
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__SET_PARAMETER:
				return setParameter != null && !setParameter.isEmpty();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__RESPONSIBLE_ROLE:
				return responsibleRole != null && !responsibleRole.isEmpty();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__STATEMENT:
				return statement != null && !statement.isEmpty();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__BY_COMPONENT:
				return byComponent != null && !byComponent.isEmpty();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__REMARKS:
				return remarks != null;
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__CONTROL_ID:
				return CONTROL_ID_EDEFAULT == null ? controlId != null : !CONTROL_ID_EDEFAULT.equals(controlId);
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT__UUID:
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
		result.append(" (controlId: ");
		result.append(controlId);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //SspImplementedRequirementImpl
