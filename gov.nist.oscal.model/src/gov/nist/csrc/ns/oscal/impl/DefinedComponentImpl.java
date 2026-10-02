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

import gov.nist.csrc.ns.oscal.ComponentControlImplementation;
import gov.nist.csrc.ns.oscal.DefinedComponent;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MarkupLineDatatype;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.Protocol;
import gov.nist.csrc.ns.oscal.ResponsibleRole;

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
 * An implementation of the model object '<em><b>Defined Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinedComponentImpl extends MinimalEObjectImpl.Container implements DefinedComponent {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected MarkupLineDatatype title;

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
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected MarkupLineDatatype purpose;

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
	 * The cached value of the '{@link #getResponsibleRole() <em>Responsible Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleRole()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibleRole> responsibleRole;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<Protocol> protocol;

	/**
	 * The cached value of the '{@link #getControlImplementation() <em>Control Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentControlImplementation> controlImplementation;

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
	protected DefinedComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getDefinedComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupLineDatatype getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(MarkupLineDatatype newTitle, NotificationChain msgs) {
		MarkupLineDatatype oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.DEFINED_COMPONENT__TITLE, oldTitle, newTitle);
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
	public void setTitle(MarkupLineDatatype newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.DEFINED_COMPONENT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.DEFINED_COMPONENT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.DEFINED_COMPONENT__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.DEFINED_COMPONENT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.DEFINED_COMPONENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.DEFINED_COMPONENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.DEFINED_COMPONENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupLineDatatype getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(MarkupLineDatatype newPurpose, NotificationChain msgs) {
		MarkupLineDatatype oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.DEFINED_COMPONENT__PURPOSE, oldPurpose, newPurpose);
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
	public void setPurpose(MarkupLineDatatype newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.DEFINED_COMPONENT__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.DEFINED_COMPONENT__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.DEFINED_COMPONENT__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.DEFINED_COMPONENT__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.DEFINED_COMPONENT__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponsibleRole> getResponsibleRole() {
		if (responsibleRole == null) {
			responsibleRole = new EObjectContainmentEList<ResponsibleRole>(ResponsibleRole.class, this, OSCALPackage.DEFINED_COMPONENT__RESPONSIBLE_ROLE);
		}
		return responsibleRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Protocol> getProtocol() {
		if (protocol == null) {
			protocol = new EObjectContainmentEList<Protocol>(Protocol.class, this, OSCALPackage.DEFINED_COMPONENT__PROTOCOL);
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentControlImplementation> getControlImplementation() {
		if (controlImplementation == null) {
			controlImplementation = new EObjectContainmentEList<ComponentControlImplementation>(ComponentControlImplementation.class, this, OSCALPackage.DEFINED_COMPONENT__CONTROL_IMPLEMENTATION);
		}
		return controlImplementation;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.DEFINED_COMPONENT__REMARKS, oldRemarks, newRemarks);
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
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.DEFINED_COMPONENT__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.DEFINED_COMPONENT__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.DEFINED_COMPONENT__REMARKS, newRemarks, newRemarks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.DEFINED_COMPONENT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.DEFINED_COMPONENT__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.DEFINED_COMPONENT__TITLE:
				return basicSetTitle(null, msgs);
			case OSCALPackage.DEFINED_COMPONENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case OSCALPackage.DEFINED_COMPONENT__PURPOSE:
				return basicSetPurpose(null, msgs);
			case OSCALPackage.DEFINED_COMPONENT__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.DEFINED_COMPONENT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.DEFINED_COMPONENT__RESPONSIBLE_ROLE:
				return ((InternalEList<?>)getResponsibleRole()).basicRemove(otherEnd, msgs);
			case OSCALPackage.DEFINED_COMPONENT__PROTOCOL:
				return ((InternalEList<?>)getProtocol()).basicRemove(otherEnd, msgs);
			case OSCALPackage.DEFINED_COMPONENT__CONTROL_IMPLEMENTATION:
				return ((InternalEList<?>)getControlImplementation()).basicRemove(otherEnd, msgs);
			case OSCALPackage.DEFINED_COMPONENT__REMARKS:
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
			case OSCALPackage.DEFINED_COMPONENT__TITLE:
				return getTitle();
			case OSCALPackage.DEFINED_COMPONENT__DESCRIPTION:
				return getDescription();
			case OSCALPackage.DEFINED_COMPONENT__PURPOSE:
				return getPurpose();
			case OSCALPackage.DEFINED_COMPONENT__PROP:
				return getProp();
			case OSCALPackage.DEFINED_COMPONENT__LINK:
				return getLink();
			case OSCALPackage.DEFINED_COMPONENT__RESPONSIBLE_ROLE:
				return getResponsibleRole();
			case OSCALPackage.DEFINED_COMPONENT__PROTOCOL:
				return getProtocol();
			case OSCALPackage.DEFINED_COMPONENT__CONTROL_IMPLEMENTATION:
				return getControlImplementation();
			case OSCALPackage.DEFINED_COMPONENT__REMARKS:
				return getRemarks();
			case OSCALPackage.DEFINED_COMPONENT__TYPE:
				return getType();
			case OSCALPackage.DEFINED_COMPONENT__UUID:
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
			case OSCALPackage.DEFINED_COMPONENT__TITLE:
				setTitle((MarkupLineDatatype)newValue);
				return;
			case OSCALPackage.DEFINED_COMPONENT__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.DEFINED_COMPONENT__PURPOSE:
				setPurpose((MarkupLineDatatype)newValue);
				return;
			case OSCALPackage.DEFINED_COMPONENT__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.DEFINED_COMPONENT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.DEFINED_COMPONENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				getResponsibleRole().addAll((Collection<? extends ResponsibleRole>)newValue);
				return;
			case OSCALPackage.DEFINED_COMPONENT__PROTOCOL:
				getProtocol().clear();
				getProtocol().addAll((Collection<? extends Protocol>)newValue);
				return;
			case OSCALPackage.DEFINED_COMPONENT__CONTROL_IMPLEMENTATION:
				getControlImplementation().clear();
				getControlImplementation().addAll((Collection<? extends ComponentControlImplementation>)newValue);
				return;
			case OSCALPackage.DEFINED_COMPONENT__REMARKS:
				setRemarks((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.DEFINED_COMPONENT__TYPE:
				setType((String)newValue);
				return;
			case OSCALPackage.DEFINED_COMPONENT__UUID:
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
			case OSCALPackage.DEFINED_COMPONENT__TITLE:
				setTitle((MarkupLineDatatype)null);
				return;
			case OSCALPackage.DEFINED_COMPONENT__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.DEFINED_COMPONENT__PURPOSE:
				setPurpose((MarkupLineDatatype)null);
				return;
			case OSCALPackage.DEFINED_COMPONENT__PROP:
				getProp().clear();
				return;
			case OSCALPackage.DEFINED_COMPONENT__LINK:
				getLink().clear();
				return;
			case OSCALPackage.DEFINED_COMPONENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				return;
			case OSCALPackage.DEFINED_COMPONENT__PROTOCOL:
				getProtocol().clear();
				return;
			case OSCALPackage.DEFINED_COMPONENT__CONTROL_IMPLEMENTATION:
				getControlImplementation().clear();
				return;
			case OSCALPackage.DEFINED_COMPONENT__REMARKS:
				setRemarks((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.DEFINED_COMPONENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OSCALPackage.DEFINED_COMPONENT__UUID:
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
			case OSCALPackage.DEFINED_COMPONENT__TITLE:
				return title != null;
			case OSCALPackage.DEFINED_COMPONENT__DESCRIPTION:
				return description != null;
			case OSCALPackage.DEFINED_COMPONENT__PURPOSE:
				return purpose != null;
			case OSCALPackage.DEFINED_COMPONENT__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.DEFINED_COMPONENT__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.DEFINED_COMPONENT__RESPONSIBLE_ROLE:
				return responsibleRole != null && !responsibleRole.isEmpty();
			case OSCALPackage.DEFINED_COMPONENT__PROTOCOL:
				return protocol != null && !protocol.isEmpty();
			case OSCALPackage.DEFINED_COMPONENT__CONTROL_IMPLEMENTATION:
				return controlImplementation != null && !controlImplementation.isEmpty();
			case OSCALPackage.DEFINED_COMPONENT__REMARKS:
				return remarks != null;
			case OSCALPackage.DEFINED_COMPONENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OSCALPackage.DEFINED_COMPONENT__UUID:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //DefinedComponentImpl
