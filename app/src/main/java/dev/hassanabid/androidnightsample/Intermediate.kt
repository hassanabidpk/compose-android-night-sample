package dev.hassanabid.androidnightsample

import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.material.Button
import androidx.ui.material.Checkbox
import androidx.ui.material.Switch
import androidx.ui.tooling.preview.Preview

@Model
class CounterState(var count: Int = 0)

@Composable
fun Counter(state: CounterState) {
    Button(
        onClick = {state.count++},
        backgroundColor = if (state.count > 5) Color.Green else Color.White
    ) {
        Text(text = "I have been clicked ${state.count} times")
    }
}

@Preview
@Composable
fun CounterPReview() {
    
    Counter(state = CounterState())
}



@Model
class FormState(var optionChecked: Boolean = false)

@Composable
fun SwitchComponent(formState: FormState) {
    Switch(
        checked = formState.optionChecked,
        onCheckedChange = { checked ->
            formState.optionChecked = checked
        }
    )
}

@Preview
@Composable
fun PreviewSwitch() {
    SwitchComponent(formState = FormState())
}

@Model
class CheckBoxFormState(var optionChecked: Boolean = true)


@Composable
fun CheckboxComponent(formState: CheckBoxFormState) {
    Checkbox(
        checked = formState.optionChecked,
        onCheckedChange = { checked ->
            formState.optionChecked = checked
        },
        color = Color.Blue
    )
}

@Preview
@Composable
fun PreviewCheckBox() {
    CheckboxComponent(formState = CheckBoxFormState())
}



